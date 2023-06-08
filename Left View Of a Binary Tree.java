import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.peek();
                q.remove();
                if(i==0){
                    res.add((int)node.data);
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null)q.add(node.right);
            }
            
        }
        return res;
    }
}
