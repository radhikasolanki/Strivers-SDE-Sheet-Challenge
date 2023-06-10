import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
         int[][] visited=new int[n][n];
        solve(res,visited,maze,0,0,n);
        return res;
    }
    
    static void solve(ArrayList<ArrayList<Integer>> res ,int[][] visited,int[][] maze,int row,int col,int n){
        if(row>=n || row<0 || col>=n || col<0 || maze[row][col]==0 ||visited[row][col]==1)
            return;
       if(row==n-1 && col==n-1 && maze[row][col]==1){
           visited[row][col]=1;
           res.add(construct(visited));
       }
        visited[row][col]=1;
        //Down
        solve(res,visited,maze,row+1,col,n);
        //Up
        solve(res,visited,maze,row-1,col,n);
        //Right
        solve(res,visited,maze,row,col+1,n);
        //Left
        solve(res,visited,maze,row,col-1,n);
        
        visited[row][col]=0;
    }
    
     public static ArrayList<Integer> construct(int[][] arr){
        ArrayList<Integer> path=new ArrayList();
        for(int[] row: arr)
            for(int i:row)
                path.add(i);
        return path;
    }
}
