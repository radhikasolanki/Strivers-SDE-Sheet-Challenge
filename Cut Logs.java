import java.util.*;
public class Solution {
    public static int fun(int n,int k,int[][]dp){
      if(k==1)
          return n;
      if(n==1 || n==0)
          return n;
      if(dp[n][k]!=-1)
          return dp[n][k];
      int ans = Integer.MAX_VALUE;
      int low = 1, high = n;
      while(low<=high){
          int mid = (low+high)/2;
          int left=fun(mid-1,k-1,dp);
          int right = fun(n-mid,k,dp);
          int temp = 1+Math.max(left,right);
          if(left>right)
              high = mid-1;
          else
              low = mid+1;
          ans = Math.min(ans,temp);
      }
      return dp[n][k]=ans;
  }

    public static int cutLogs(int k, int n) {
        //Write your code here
        int[][]dp = new int[10005][105];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        return fun(n,k,dp);
    }
}
