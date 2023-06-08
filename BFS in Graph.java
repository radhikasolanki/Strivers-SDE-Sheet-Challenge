import java.util.* ;
import java.io.*; 


public class Solution {
	public static void bfs(int node, ArrayList<ArrayList<Integer>> adj,int[]vis,ArrayList<Integer> res){
		Queue<Integer> q=new LinkedList<>();
		q.add(node);
		vis[node]=1;
		
		while(!q.isEmpty()){
			//int size=q.size();
			int n=q.peek();
			q.remove();
			for(int it:adj.get(n)){
				if(vis[it]==0){
					q.add(it);
					vis[it]=1;
				}
			}
			res.add(n);
		}
	}

	public static ArrayList<Integer> BFS(int vertex, int edges[][]){
		// WRITE YOUR CODE HERE
		ArrayList<Integer> res=new ArrayList<>();
		// for(int i[]:edges){
		// 	System.out.println(Arrays.toString(i));
		// }
		
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		for(int i=0;i<vertex;i++){
			adj.add(new ArrayList<>());
		}
		for(int i=0;i<edges[0].length;i++){
			adj.get(edges[0][i]).add(edges[1][i]);
			adj.get(edges[1][i]).add(edges[0][i]);
		}
		for(int i=0;i<vertex;i++){
			Collections.sort(adj.get(i));
		}
		
		int[]vis=new int[vertex];
		for(int i=0;i<vertex;i++){
			if(vis[i]==0){
				bfs(i,adj,vis,res);
			}
		}
		return res;
	}
}

