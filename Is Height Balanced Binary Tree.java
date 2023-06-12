/*************************************************************

Following is the Binary Tree node structure

class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

*************************************************************/
public class Solution {

	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		// Write your code here.
        return dfsHeight(root)!=-1;
	}
  public static int dfsHeight(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int lh = dfsHeight(root.left);
        if(lh == -1) return -1;
        int rh = dfsHeight(root.right);
        if(rh == -1) return -1;
        
        if(Math.abs(lh-rh)>1) 
            return -1;
        
        return Math.max(lh,rh)+1;
    }
}
