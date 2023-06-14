import java.util.*;
public class Solution {
	public static long fun(int ind, int[]arr, int val,long[][]dp){
		// if(val==0){
		// 	return 0;
		// }
		if(ind==0){
			return val%arr[0]==0?1:0;
		}
		if(dp[ind][val]!=-1)return dp[ind][val];
		long take=0;
		if(arr[ind]<=val){
			take=fun(ind,arr,val-arr[ind],dp);
		}
		long notTake=fun(ind-1,arr,val,dp);
		return dp[ind][val]=take+notTake;
	}

	public static long countWaysToMakeChange(int denominations[], int value){
        //write your code here	
		
		int n=denominations.length;
		long[][]dp=new long[n][value+1];
		for(long[]i:dp){
			Arrays.fill(i,-1);
		}
		return fun(n-1,denominations,value,dp);		

	}
	
}
