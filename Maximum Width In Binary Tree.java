import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	   }
	}


************************************************************/
class Pair{
	TreeNode node;
	int num;
	Pair(TreeNode node, int num){
		this.node=node;
		this.num=num;
	}
}
public class Solution {
	public static int getMaxWidth(TreeNode root) {
		// Write your code here.
		// if(root==null)return 0;
		// int ans=0;
		// Queue<TreeNode> q=new LinkedList<>();
		// q.add(root);
		// int max=0;




		if(root==null)return 0;
		int res=0; int assign=0;
		Queue<Pair>q=new LinkedList<>();
		q.add(new Pair(root,0));
		while(!q.isEmpty()){
			int size=q.size();
			int min=q.peek().num; //to make the id starting from zero;

			int first=0;
			int last=0;		for(int i=0;i<size;i++){
				int cur_id=q.peek().num-min;
				TreeNode node=q.peek().node;
				q.remove();
				if(i==0){
					first=cur_id;
				}
				if(i==size-1){
					last=cur_id;
				}
				if(node.left!=null)q.add(new Pair(node.left,++assign));
				if(node.right!=null)q.add(new Pair(node.right,++assign));
			}
			res=Math.max(res,last-first+1);
		}
		return res;
	

	}
}
