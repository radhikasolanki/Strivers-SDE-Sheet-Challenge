import java.util.* ;
import java.io.*; 
/*

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

*/

public class Solution  

{

 

public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q)  {  
       // Write your code here
       while(root!=null){
           if(root.data>p.data && root.data>q.data)
               root=root.left;
           else if (root.data<p.data && root.data<q.data)
               root=root.right;
           else break;
       }
       return root;
    }
}
