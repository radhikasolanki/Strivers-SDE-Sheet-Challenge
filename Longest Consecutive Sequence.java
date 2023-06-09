import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int max=0;
        for(int i=0;i<N;i++){
            int count=1;
            if(!set.contains(arr[i]-1)){
                int temp=arr[i]+1;
                while(set.contains(temp)){
                    temp++;
                    count++;

                }
                max=Math.max(max,count);
            }

        }
        return max;
    }
}
