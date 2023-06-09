import java.util.* ;
import java.io.*; 
public class Solution {
public static void fun(int ind, int[]arr,ArrayList<Integer> list, ArrayList<ArrayList<Integer>>res){
          res.add(new ArrayList<>(list));
           for(int i=ind;i<arr.length;i++){
               if(i!=ind && arr[i]==arr[i-1])continue;
               list.add(arr[i]);
               fun(i+1,arr,list,res);
               list.remove(list.size()-1);
           }

    }

    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<Integer>());
        fun(0,arr,new ArrayList<Integer>(),res);
        return res;
    }

}
