import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void dfs(int node,int[]vis,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st){
        vis[node]=1;
        for(int it:adj.get(node)){
            if(vis[it]==0){
                dfs(it,vis,adj,st);
            }
        }
        st.add(node);
    }
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=v;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){
           adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            //adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }

        int[]vis=new int[v];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<v;i++){
           if(vis[i]==0){
               dfs(i,vis,adj,st);
           }
        }
        
        while(!st.isEmpty()){
            res.add(st.pop());
        }
       // System.out.println(res);
        return res;
    }
}
