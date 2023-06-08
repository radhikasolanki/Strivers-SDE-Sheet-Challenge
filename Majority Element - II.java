import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.size();
        HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
		}
		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
			int key=entry.getKey();
			int value=entry.getValue();
			if(value>n/3){
				res.add(key);
			}
		}
		return res;
    }
}
