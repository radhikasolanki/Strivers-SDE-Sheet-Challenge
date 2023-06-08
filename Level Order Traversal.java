import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.ArrayList;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
	ArrayList<Integer> res=new ArrayList<>();
	if(root==null)return res;
	Queue<BinaryTreeNode> q=new LinkedList<>();
	q.add(root);
	while(!q.isEmpty()){
		int size=q.size();
		for(int i=0;i<size;i++){
			BinaryTreeNode node=q.peek();
			q.remove();
			res.add(node.val);
			if(node.left!=null)q.add(node.left);
			if(node.right!=null)q.add(node.right);
		}
	}
	return res;
  }

}
