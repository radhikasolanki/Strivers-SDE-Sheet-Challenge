import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/

public class Solution {
	public static void infun(BinaryTreeNode node,ArrayList<Integer> list){
		if(node==null)return;
		infun(node.left,list);
		list.add((int)node.data);
		infun(node.right,list);
	}
	public static void prefun(BinaryTreeNode node,ArrayList<Integer> list){
		if(node==null)return;
		list.add((int)node.data);
		prefun(node.left,list);
		
		prefun(node.right,list);
	}
		public static void postfun(BinaryTreeNode node,ArrayList<Integer> list){
		if(node==null)return;
		
		postfun(node.left,list);
		
		postfun(node.right,list);
		list.add((int)node.data);
	}
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
		List<List<Integer>>res=new ArrayList<>();
		ArrayList<Integer> inorder=new ArrayList<>();
		ArrayList<Integer> preorder=new ArrayList<>();
		ArrayList<Integer> postorder=new ArrayList<>();

		infun(root,inorder);
		prefun(root,preorder);
		postfun(root,postorder);
		res.add(inorder);
		res.add(preorder);
		res.add(postorder);
		return res;
    }
}
