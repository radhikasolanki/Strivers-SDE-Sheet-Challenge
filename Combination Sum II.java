import java.util.ArrayList;
import java.util.*;

public class Solution 
{
    public static void fun(int ind, ArrayList<Integer> arr, int target, ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<arr.size();i++){
            if(i!=ind && arr.get(i)==arr.get(i-1))continue;

            //if(arr.get(i)<=target){
                list.add(arr.get(i));
                fun(i+1,arr,target-arr.get(i),res,list);
                list.remove(list.size()-1);
            //}
            
        }
    }
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        fun(0,arr,target,res,list);
        return res;
    }
}
