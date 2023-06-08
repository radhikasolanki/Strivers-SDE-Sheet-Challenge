import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean fun(int ind, int target,int []arr,int[][]dp){
        if(target==0){
            return true;
        }
        if(ind<0){
            //if(target==0)return true;
            return false;
        }
        if(dp[ind][target]!=-1){
            return dp[ind][target]==0?false:true;
        }

        boolean take=false;
        if(arr[ind]<=target)
        take =fun(ind-1,target-arr[ind],arr,dp);
        boolean notTake=fun(ind-1,target,arr,dp);
        dp[ind][target]=(take|notTake)==true?1:0;
        return take|notTake;

    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int[][]dp=new int[n][k+1];
        for(int[]i:dp)Arrays.fill(i,-1);
        return fun(n-1,k,arr,dp);
    }
}
