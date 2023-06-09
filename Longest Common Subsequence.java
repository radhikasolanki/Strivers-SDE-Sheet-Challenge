import java.util.*;
public class Solution {
     public static int fun(String s1, String s2, int ind1, int ind2,int[][]dp){
        if(ind1<0 || ind2<0){
            return 0;
        }
       if(dp[ind1][ind2]!=-1)
        return dp[ind1][ind2];
       
        if(s1.charAt(ind1)==s2.charAt(ind2)){
            return dp[ind1][ind2] = 1 + fun(s1,s2,ind1-1,ind2-1,dp);
        }
       else
        return dp[ind1][ind2] =  Math.max(fun(s1,s2,ind1,ind2-1,dp),fun(s1,s2,ind1-1,ind2,dp));
    }
	public static int lcs(String s, String t) {
		//Your code goes here
        int n=s.length();
        int m=t.length();

        int dp[][]=new int[n][m];
        for(int rows[]: dp)
             Arrays.fill(rows,-1);
        return fun(s,t,n-1,m-1,dp);
    }


}
