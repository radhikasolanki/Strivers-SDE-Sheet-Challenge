import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr);
        List<int[]> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==j)continue;
                if(arr[i]+arr[j]==s){
                    res.add(new int[]{arr[i],arr[j]});
                }
            }
        }
        return res;
    }
}
