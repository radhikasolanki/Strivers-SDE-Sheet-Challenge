import java.util.*;
public class Solution 
{
    public static void fun(int ind, int n, int k, ArrayList<Integer> list, ArrayList<ArrayList<Integer>>res,ArrayList<Integer> arr){
        if(k==0){
            res.add(new ArrayList<>(list));
           
        }

        if(ind==n)return;
       
        // //if(arr.get(ind)<= k){
        //     fun(ind+1,n,k-arr.get(ind),list,res,arr,sum+arr.get(ind));
        // //}
        //  fun(ind+1,n,k,list,res,arr,sum);
        for(int i=ind;i<n;i++){
            list.add(arr.get(i));
            fun(i+1,n,k-arr.get(i),list,res,arr);
            list.remove(list.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        fun(0,n,k,list,res,arr);
        return res;
    }
}
