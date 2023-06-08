import java.util.* ;
import java.io.*; 
/*
	
	Following is the Binary Tree node structure:

	public class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.data = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	       this.data = val;
	        this.left = left;
	        this.right = right;
	    }
	}

*/

public class Solution {
	public static void fun(TreeNode root, ArrayList<Integer> list){
        if(root==null)
        return;
		list.add(root.data);
        fun(root.left,list);
        fun(root.right,list);
    }
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		ArrayList<Integer> res=new ArrayList<>();
        fun(root,res);
        return res;
    }
}
