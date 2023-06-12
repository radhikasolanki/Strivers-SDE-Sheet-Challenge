import java.util.ArrayList;
import java.util.*;
public class Solution {
	public static int fun(int ind,int w, ArrayList<Integer> values, ArrayList<Integer> weights,int[][]dp){
		if(ind==values.size())return 0;
		if(dp[ind][w]!=-1)return dp[ind][w];
		int take=0;
		if(weights.get(ind)<=w){
			take= values.get(ind)+fun(ind+1,w-weights.get(ind),values,weights,dp);
		}
		int notTake=fun(ind+1,w,values,weights,dp);
		return dp[ind][w]= Math.max(take,notTake);
	}
	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		// Write your code here.
		int[][]dp=new int[values.size()][w+1];
		for(int []i:dp){
			Arrays.fill(i,-1);
		}
		return fun(0,w,values,weights,dp);
	}
}
