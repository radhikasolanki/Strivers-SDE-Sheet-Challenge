import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int fun(int ind, int prev,ArrayList<Integer>arr,int[][]dp){
        if(ind<0)return 0;
        if(dp[ind][prev+1]!=-1)return dp[ind][prev+1];
        int take=0;
        if(prev==-1 ||arr.get(prev)>arr.get(ind)){
            take=arr.get(ind)+fun(ind-1,ind,arr,dp);
        }
        int notTake=fun(ind-1,prev,arr,dp);
        return dp[ind][prev+1] =Math.max(take,notTake);

    }
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
        // Write your code here.
        int[][]dp=new int[n][n+1];
        for(int i[]:dp)Arrays.fill(i,-1);
        return fun(n-1,-1,rack,dp);
    }
}
