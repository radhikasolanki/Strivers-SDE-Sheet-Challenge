import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer,Integer> map=new HashMap<>();
		int sum=0;
		int max=0;
		int s=0;
		for(int i=0;i<arr.size();i++){
			sum+=arr.get(i);
			if(map.containsKey(sum)){
				s=i-map.get(sum);
			}
			else{
				map.put(sum,i);
			}
			if(sum==0){
				s=i+1;
			}
			max=Math.max(max,s);
		}
		return max;

	}
}


