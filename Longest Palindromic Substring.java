public class Solution {	
	public static String longestPalinSubstring(String s) {
		// Write your code here.
		int n = s.length(), start = 0, end = 0;
        boolean[][] dp = new boolean[n][n];
        for (int j=0;j<n;j++) {
          for (int i=0; i+j<n; i++) {
            dp[i][i+j] = s.charAt(i) == s.charAt(i+j) && (j < 2 || dp[i+1][i+j-1]);
            if (dp[i][i+j] && j > end - start) {
                start = i;
                end = i + j;
            }
        }
    }

    return s.substring(start, end + 1);
	}
}
