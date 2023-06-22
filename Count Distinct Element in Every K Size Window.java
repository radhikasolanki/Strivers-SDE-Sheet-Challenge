import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
		ArrayList<Integer> res=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<k;i++){
			map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
		}
		int i=0;
		int j=k;
		while(j<arr.size()){
			res.add(map.size());
			if(map.get(arr.get(i))>1){
                map.put(arr.get(i),map.get(arr.get(i))-1);
			}
			else{
				map.remove(arr.get(i));
			}
			map.put(arr.get(j),map.getOrDefault(arr.get(j),0)+1);
			i++;
			j++;
		}
		res.add(map.size());
		return res;
	}
}
