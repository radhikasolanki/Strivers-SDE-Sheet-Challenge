import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> merge(ArrayList<Integer> list1,ArrayList<Integer> list2){
		if(list1.size()==0)return list2;
		if(list2.size()==0)return list1;
		int i=0;
		int j=0;
		ArrayList<Integer> res=new ArrayList<>();
		while(i<list1.size() && j<list2.size()){
               if(list1.get(i)<=list2.get(j)){
				   res.add(list1.get(i));
				   i++;
			   }
			   else{
				   res.add(list2.get(j));
				   j++;
			   }
		}
		while(i<list1.size()){
			res.add(list1.get(i));
			i++;
		}
		while(j<list2.size()){
			res.add(list2.get(j));
				   j++;
		}
		return res;
	}
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<k;i++){
              list=merge(list,kArrays.get(i));
		}
		return list;
	}
}
