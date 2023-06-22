import java.util.ArrayList;

import java.util.Stack;

public class Solution {

  public static boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int curr, boolean[] stack){

    vis[curr] =true;

    stack[curr] = true;

    for(int ne: adj.get(curr)){

      if(!vis[ne]){

        dfs(adj,vis,ne,stack);

      }

       if(stack[ne]){

        return true;

      }

    }

    stack[curr] = false;

    return false;

  }

  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
  for(int i=0; i<=n; i++){

    adj.add(new ArrayList<>());

  }
    for(int i=0; i<edges.size(); i++){
        int u = edges.get(i).get(0);

        int v = edges.get(i).get(1);
        adj.get(u).add(v); // directed graph
    }
    boolean[] vis = new boolean[n+1];

    boolean[] stack = new boolean[n+1];

    for(int i=1; i<=n; i++){    //  for travers all the components of graph  

        if(!vis[i]){

          if(dfs(adj,vis,i,stack))

            return true;

        }

    }

  return false;

  }

}
