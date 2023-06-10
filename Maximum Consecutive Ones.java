import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
		int i=0;
		int j=1;
		int countzero=arr.get(i)==0?1:0;
		int res=0;
		while(j<n){
			if(arr.get(j)==1){
				j++;
				res=Math.max(res,j-i);
			}
			else if(arr.get(j)==0 && countzero<k){
				countzero++;
				j++;
				res=Math.max(res,j-i);
				
			}
			else{
				if(arr.get(i)==0){
				   countzero--;
				   i++;
				}
				else{
					i++;
					//j++;
				}
			   // res=Math.max(res,j-i);
			}
		}
		return res;
	}
}
