import java.util.* ;
import java.io.*; 
 
 
/*************************************************************
	Following is the Binary Tree node structure
	class TreeNode<T> {
		public T data;
		public TreeNode<T> left;
		public TreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = right = null;
		}

};************************************************************/
public class Solution {
 
    static int globalPtr = 0;
    
    public static TreeNode<Integer> preOrderTree(int[] preOrder) {
        TreeNode<Integer> root =  createTree(preOrder,Integer.MAX_VALUE); 
        globalPtr = 0;  
        return root;
    }
    
    public static TreeNode createTree(int[] preOrder,int max){
        if(globalPtr >= preOrder.length || preOrder[globalPtr] > max)
                return null;      
        TreeNode<Integer> node = new TreeNode<Integer>(preOrder[globalPtr++]);
        node.left   = createTree(preOrder, node.data);
        node.right = createTree(preOrder, max);    
        return node;
    }
}
