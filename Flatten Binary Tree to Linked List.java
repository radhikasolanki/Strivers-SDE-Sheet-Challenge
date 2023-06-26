import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure.

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/

public class Solution 
{
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        // Write your code here.
		TreeNode<Integer> curr=root;
        TreeNode<Integer> r=curr;
       while(curr!=null){
           if(curr.left!=null){
           TreeNode<Integer> runner=curr.left;
           while(runner.right!=null){
               runner=runner.right;
               }
               runner.right=curr.right;
               curr.right=curr.left;
               curr.left=null;
           }
           curr=curr.right;
       }
        return r;
    }
}
