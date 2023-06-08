import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
			int key=entry.getKey();
			int value=entry.getValue();
			if(value>n/2){
				return key;
			}
		}
		return -1;
	}
}
