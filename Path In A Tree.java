import java.util.* ;
import java.io.*; 
/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/

public class Solution {
    public static boolean fun(TreeNode root, int x, ArrayList<Integer> list){
        if(root==null)return false;
        list.add(root.data);
        if(root.data==x)return true;
        
        if(fun(root.left,x,list)||fun(root.right,x,list)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)return list;
        fun(root,x,list);
        return list;
    }
}
