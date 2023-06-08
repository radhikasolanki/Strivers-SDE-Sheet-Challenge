import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int sum=0;
        int rep=0;
        int miss=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                rep=i;
            }
            sum=sum+i;
            set.add(i);
        }
        int nsum=0;
        for(int i=1;i<=n;i++){
            nsum+=i;
        }
        int s=sum-rep;
        miss=nsum-s;
        return new int[]{miss,rep};
        
    }
}
