import java.util.ArrayList;

public class Solution {
    public static void dfs(int node, int[]vis, ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>list){
        vis[node]=1;
        for(int it:adj.get(node)){
            if(vis[it]==0){
                dfs(it,vis,adj,list);
            }
        }
        list.add(node);
    }
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());

        }
        for(int i=0;i<e;i++){
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
            
        }
       // System.out.println(adj);
       int[]vis=new int[v];
       for(int i=0;i<v;i++){
           if(vis[i]==0){
               ArrayList<Integer> list=new ArrayList<>();
               dfs(i,vis,adj,list);
               res.add(list);
           }
       }
        return res;
    }
}
