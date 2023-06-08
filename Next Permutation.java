import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static void swap(int i, int j,ArrayList<Integer> arr ){
		int temp=arr.get(i);
		arr.set(i,arr.get(j));
		arr.set(j,temp);
	}
	public static void reverse(int i, int j, ArrayList<Integer> arr){
		while(i<j){
			swap(i,j,arr);
			i++;
			j--;
		}

	}
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		int i=permutation.size()-2;
		while(i>=0 && permutation.get(i)>=permutation.get(i+1)){
			i--;
		}
		if(i>=0){
			int j=permutation.size()-1;
			while(j>=0 && permutation.get(j)<=permutation.get(i)){
				j--;
			}
			swap(i,j,permutation);
		}
		
		reverse(i+1,permutation.size()-1, permutation);
		return permutation;

	}
}





