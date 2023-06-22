
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
		String res=arr[0];
		for(int i=1;i<n;i++){
			for(int j=0;j<res.length() && j<arr[i].length();j++){
				if(arr[i].charAt(j)!=res.charAt(j)){
					res=res.substring(0,j);
					break;
				}
			}
		}
		return res;
	}

}
