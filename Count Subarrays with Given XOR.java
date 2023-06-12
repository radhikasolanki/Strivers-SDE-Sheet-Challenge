import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		int s=0;
		int count=0;
		for(int i=0;i<arr.size();i++){
			s=s^arr.get(i);
			int k=s^x;
			if(map.containsKey(k)){
				count+=map.get(k);
			}
			map.put(s,map.getOrDefault(s,0)+1);
		}
		return count;
	}
}
