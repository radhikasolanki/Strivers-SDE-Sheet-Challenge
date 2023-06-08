import java.util.* ;
import java.io.*; 
/*
	Following is the class used to represent the object/node of the Binary Tree

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}
*/

public class Solution {
	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		// Write your code here!
		List<Integer> res=new ArrayList<>();
		if(root==null)return res;
		Queue<BinaryTreeNode> q=new LinkedList<>();
		q.add(root);
		boolean f=false;
		while(!q.isEmpty()){
			int size=q.size();
			ArrayList<Integer> arr=new ArrayList<>();
			
			for(int i=0;i<size;i++){
                BinaryTreeNode node=q.peek();
				q.remove();
				if(f)arr.add(0,(int)node.data);
				else arr.add((int)node.data);
				if(node.left!=null)q.add(node.left);
				if(node.right!=null)q.add(node.right);
			}
			for(int i=0;i<arr.size();i++){
				res.add(arr.get(i));
			}
			f=!f;
		}
		return res;

	}
}
