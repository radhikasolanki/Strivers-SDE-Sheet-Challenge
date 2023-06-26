import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the Tree node structure
	
	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

************************************************************/

public class Solution {
    public static long max;
    public static int count;
    public static long findMaxSumPath(TreeNode root) {
        // Write your code here.
        max=0;count=0;
        find(root);
        if(count<2)
            return -1;
        return max;
    }
    public static int find(TreeNode root)
    {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            count++;
        int left=find(root.left);
        int right=find(root.right);
        max=Math.max(max,left+right+root.data);
        return root.data+Math.max(left,right);
       
    }
}
