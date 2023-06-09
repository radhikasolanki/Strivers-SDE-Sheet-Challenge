import java.util.* ;
import java.io.*; 
public class Solution {
    public static void fun(int ind, int[]arr, ArrayList<Integer> list,int sum){
        if(ind==arr.length){
            return;
        }
        fun(ind+1,arr,list,sum);
        sum+=arr[ind];
        list.add(sum);
        fun(ind+1,arr,list,sum);
        
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        fun(0,num,list,0);
        Collections.sort(list);
        return list;
    }

}
