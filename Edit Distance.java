import java.util.*;
public class Solution {
    public static int fun(int i, int j, String s1, String s2,int[][]dp){
        if(i==0)return j;
        if(j==0)return i;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i-1)==s2.charAt(j-1))
          return fun(i-1,j-1,s1,s2,dp);
        else{
            return dp[i][j]=1+Math.min(fun(i,j-1,s1,s2,dp),Math.min(fun(i-1,j-1,s1,s2,dp),fun(i-1,j,s1,s2,dp)));
        }
    }

    public static int editDistance(String str1, String str2) {
        //Your code goes here
        int[][]dp=new int[str1.length()+1][str2.length()+1];
        for(int[]i:dp){
            Arrays.fill(i,-1);
        }
        return fun(str1.length(),str2.length(),str1,str2,dp);
    }
}
