import java.util.* ;
import java.io.*; 
public class Solution {
	public static void fun(int ind, ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> res, ArrayList<Integer>list){
		if(ind>=arr.size()){
			res.add(new ArrayList<Integer>(list));
			return;
		}
		list.add(arr.get(ind));
		fun(ind+1,arr,res,list);
		list.remove(list.size()-1);
		fun(ind+1,arr,res,list);
	}
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
		Collections.sort(arr);
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		res.add(list);
		fun(0,arr,res,list);
		return res;

	}
}

