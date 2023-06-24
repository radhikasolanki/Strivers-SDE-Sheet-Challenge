import java.util.* ;
import java.io.*; 
/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/

public class Solution {
	public static void inorder(BinaryTreeNode root, ArrayList<Integer> arr){
		if(root==null){
			return;
		}
		inorder(root.left,arr);
		arr.add(root.data);
		inorder(root.right,arr);
	    }
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.
		ArrayList<Integer> list=new ArrayList<>();
		inorder(root,list);
		int i=0;
		int j=list.size()-1;
		while(i<j){
			if(list.get(i)+list.get(j)==k){
				return true;
			}
			else if(list.get(i)+list.get(j)>k){
				j--;
			}
			else{
				i++;
			}
		}
		return false;
	}
}

