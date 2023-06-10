import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        long[]left=new long[n];
        long[]right=new long[n];
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            left[i]=max;
        }
        max=Long.MIN_VALUE;
        for(int j=n-1;j>=0;j--){
            max=Math.max(max,arr[j]);
            right[j]=max;
        }

        long res=0;
        for(int i=0;i<n;i++){
            res=res+Math.min(left[i],right[i])-arr[i];
        }
        return res;

    }
}
