import java.util.* ;
import java.io.*; 
public class Solution {
	public static int fun(int i, int j,int m, int n,int[][]dp){
		if(i==0 && j==0){
			return 1;
		}
		 if(i<0 || i>=m ||j<0 ||j>=n){
			return 0;
		}
		if(dp[i][j]!=-1){
			return dp[i][j];
		}
		int right=fun(i-1,j,m,n,dp);
		int down=fun(i,j-1,m,n,dp);
		return dp[i][j]=right+down;
	}
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		int[][] dp=new int[m][n];
		for(int[]i:dp){
			Arrays.fill(i,-1);
		}
		return fun(m-1,n-1,m,n,dp);
	}
}
