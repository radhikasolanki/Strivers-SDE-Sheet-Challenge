import java.util.* ;
import java.io.*; 
/*
    ----------------- Binary Tree node class for reference -----------------

    class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;
	    public BinaryTreeNode<T> next;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	        next = null;
	    }
	};

*/

public class Solution {
	public static void connectNodes(BinaryTreeNode<Integer> root) {
    	// Write your code here.
        
        if(root == null)
            return;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            BinaryTreeNode prev = null;
            for(int i=0;i<n;i++){
              BinaryTreeNode cur = q.poll();
                if(prev!=null){
                    prev.next = cur;
                    
                }
                prev = cur;
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
            }
            prev = null;
        }
	}
}
