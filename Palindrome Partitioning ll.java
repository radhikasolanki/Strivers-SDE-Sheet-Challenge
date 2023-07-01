import java.util.*;
public class Solution {
public static int palindromePartitioning(String str) {
       int[][] dp=new int[str.length()][str.length()];
       for(int[] row:dp){
           Arrays.fill(row,-1);
       }
    return fun(str,0,str.length()-1,dp);
}
   private static int fun(String s,int i,int j,int[][] dp){
       if(i>=j) return 0;
       if(isPalindrome(s,i,j)) return 0;
       if(dp[i][j]!=-1) return dp[i][j];
       int min=Integer.MAX_VALUE;
       
       for(int k=i;k<=j-1;k++){
           int temp=1+fun(s,i,k,dp)+fun(s,k+1,j,dp);
            min=Math.min(temp,min);
       }
       dp[i][j]=min;
       return min;
   }
   private static boolean isPalindrome(String s,int i,int j){
       while(i<j){
           if(s.charAt(i)==s.charAt(j)){
               i++;
               j--;
           }else {
               return false;
           }
       }
       return true;
   }
}
