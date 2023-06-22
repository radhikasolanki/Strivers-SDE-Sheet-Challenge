public class Solution {

	public static int zAlgorithm(String s, String p, int n, int m) {
		// Write your code here
		int res=0;
		int i=0;
        int j=p.length()-1;
        while(j<s.length()){
            if(s.substring(i,j+1).equals(p)){
                 res++;
            }
            i++;
            j++;
        }
        return res;

	}

}
