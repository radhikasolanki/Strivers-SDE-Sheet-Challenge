import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

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

************************************************************/

class Pair{
    BinaryTreeNode node;
    int ver;
    //int val;
    Pair(BinaryTreeNode node,int ver){
        this.node=node;
        this.ver=ver;
        //this.val=val;
    }
}
public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		// Write your code here.
		ArrayList<Integer> res=new ArrayList<>();
        if(root==null)return res;
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair p = q.peek();
                BinaryTreeNode node=p.node;
                int ver=p.ver;
                int val=node.val;
                if(!map.containsKey(ver)){
                    map.put(ver,val);
                }
                q.remove();
                if(node.left!=null){
                    q.add(new Pair(node.left,ver-1));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right,ver+1));
                }

            }
        }
        for(int i:map.values()){
            res.add(i);
        }
        return res;

	}
}
