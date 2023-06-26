import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

 *************************************************************/

public class Solution {
   public static boolean validateBST(BinaryTreeNode<Integer> root) {
        return validate(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static boolean validate(BinaryTreeNode<Integer> root, int lb, int ub){
        if(root == null)
            return true;
        if(root.data < lb || root.data > ub)
            return false;
        return validate(root.left,lb,root.data) && validate(root.right,root.data,ub);
    }
}
