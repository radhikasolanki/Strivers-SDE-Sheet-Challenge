import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		for(int i=0;i<n;i++){
			int j=i+1;
			int k=n-1;
			
			while(j<k){
				if(arr[i]+arr[j]+arr[k]==K){
					ArrayList<Integer> list=new ArrayList<>();
                    list.add(arr[i]);
					list.add(arr[j]);
					list.add(arr[k]);
					res.add(list);
					while(j<k && arr[j+1]==arr[j])j++;
					while(j<k && arr[k-1]==arr[k])k--;
					j++;
					k--;
				}
				else if(arr[i]+arr[j]+arr[k]<K){
					j++;
				}
				else{
					k--;
				}
			}
			while(i+1<n && arr[i]==arr[i+1])i++;
			
		}
		return res;

	}
}
