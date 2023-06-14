import java.util.* ;
import java.io.*; 
public class Solution {
   
    public static int fun(int i, int j, int[][]grid,int[][]dp){
        if(i==0 && j==0){
            return dp[i][j]=grid[0][0];
        }
        if(dp[i][j]!=-1)return dp[i][j];

         int up = Integer.MAX_VALUE;
         int left = Integer.MAX_VALUE;

         if(i>0){
             up=grid[i][j]+fun(i-1,j,grid,dp);
         }
         if(j>0){
             left=grid[i][j]+fun(i,j-1,grid,dp);
         }
         return dp[i][j]=Math.min(up,left);
    }
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m][n];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return fun(m-1,n-1,grid,dp);
    }
}
