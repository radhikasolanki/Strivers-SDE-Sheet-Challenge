import java.util.*;
public class Solution {
	public static int fun(int ind, int[]arr, int n,int[][]dp){
		if(ind==0){
			return n*arr[ind];
		}
		if(dp[ind][n]!=-1)return dp[ind][n];

		int take=Integer.MIN_VALUE;
		if(ind+1<=n){
			take= arr[ind]+fun(ind,arr,n-(ind+1),dp);
		}
		int notTake=fun(ind-1,arr,n,dp);
		return dp[ind][n]= Math.max(take,notTake);

	}
	public static int cutRod(int price[], int n) {
		// Write your code here.
		int[][]dp=new int[n][n+1];
		for(int []i:dp){
			Arrays.fill(i,-1);
		}
		return fun(n-1,price,n,dp);
	}
}
