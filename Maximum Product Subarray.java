import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int left=1;
		int right=1;
		int pro=1;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			left=left*arr.get(i);
			right=right*arr.get(n-1-i);
			pro=Math.max(left,right);
			max=Math.max(max,pro);
			if(left==0)left=1;
			if(right==0)right=1;
		}
		return max;
	}
}
