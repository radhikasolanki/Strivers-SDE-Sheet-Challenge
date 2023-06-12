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
class Pair{
    TreeNode node;
    int ver;
    Pair(TreeNode node,int ver){
        this.node=node;
        this.ver=ver;
    }
}

public class Solution 
{
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> res=new ArrayList<>();
        Map<Integer,ArrayList<Integer>> map=new TreeMap<>();
        if(root==null)return res;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.peek().node;
                int ver=q.peek().ver;
                q.remove();
                if(!map.containsKey(ver)){
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add((int)node.data);
                    map.put(ver,list);
                }
                else{
                    ArrayList<Integer> list=map.get(ver);
                    list.add((int)node.data);
                    map.put(ver,list);
                }
                if(node.left!=null)
                  q.add(new Pair(node.left,ver-1));
                if(node.right!=null)
                  q.add(new Pair(node.right,ver+1));
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet()){
            int key=entry.getKey();
            ArrayList<Integer> list=entry.getValue();
            for(int i:list){
                res.add(i);
            }
        }
        return res;

    }
}
