import java.util.* ;
import java.io.*; 
/*********************************************

    class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

*********************************************/


class Pair{
    BinaryTreeNode node;
    int ver;
    Pair(BinaryTreeNode node, int ver){
        this.node=node;
        this.ver=ver;
    }

}
public class Solution {

    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
         // Write your code here. 
         ArrayList<Integer> res=new ArrayList<>();
         if(root==null)return res;     
         Map<Integer,Integer> map=new TreeMap<>();  
         Queue<Pair> q= new LinkedList<>();
         q.add(new Pair(root,0));
         while(!q.isEmpty()){
             
             int size=q.size();
             for(int i=0;i<size;i++){
                 BinaryTreeNode node=q.peek().node;
                 int ver=q.peek().ver;
                 q.remove();
                 map.put(ver,node.val);
                 if(node.left!=null)q.add(new Pair(node.left,ver-1));
                 if(node.right!=null)q.add(new Pair(node.right,ver+1));
             }
         }
         for(int i:map.values()){
             res.add(i);
         }
         return res;
    }
}
