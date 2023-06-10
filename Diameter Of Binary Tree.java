/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/
import java.util.*;
public class Solution {
	public static int fun(TreeNode root, int[]d){
		if(root==null)return 0;
		int left=fun(root.left,d);
		int right=fun(root.right,d);
		d[0]=Math.max(d[0],left+right);
		return 1+Math.max(left,right);

	}
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.

		//diameter = left tree val+right tree val
          int[]dia=new int[1];
          fun(root,dia);
		  return dia[0];

	}
}
