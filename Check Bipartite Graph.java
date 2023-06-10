import java.util.ArrayList;
import java.util.*;

public class Solution {
    public static boolean dfs(int node, int col,int[]color, ArrayList<ArrayList<Integer>> adj){
        color[node]=col;
        for(int it:adj.get(node)){
            if(color[it]==-1){
                if(dfs(it,1-col,color,adj)==false)return false;
            }
            else if(color[it]==col){
                return false;
            }
        }
        return true;

    }

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {

        // Write your code here
        int v=edges.size();
        int u=edges.get(0).size();

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<u;j++){
                if(edges.get(i).get(j)==1){
                   adj.get(i).add(j);
                   adj.get(j).add(i);
                }
            }
        }
        int[]color=new int[v];
        Arrays.fill(color,-1);
        for(int i=0;i<v;i++){
            if(color[i]==-1){
                if(dfs(i,0,color,adj)==false)return false;
            }
        }
        return true;
    }
}

// 0 1 1
// 0 0 1
// 0 0 0
