import java.util.*;
public class Solution {
    
    public static boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,int[]vis){
        vis[node]=1;
        for(int it:adj.get(node)){
            if(vis[it]==0){
                if(dfs(it,adj,vis)==true)return true;
            }
        }
        return false;
    }
    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
      //  System.out.println(adj);
       boolean[]vis = new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(!vis[i] && isCycle(adj,vis,i,-1)){
                return "Yes";
            }
        }
        return "No";
    }       
       
    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj,boolean[]vis,int v,int parent){
        vis[v]=true;
        for(int child : adj.get(v)){
            if(!vis[child]){
                if(isCycle(adj,vis,child,v))
                    return true;
            }
           
        else if(child!=parent){
            return true;
        }
    }
    return false;
    }
}
