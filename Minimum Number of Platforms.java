import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);
        int i=1;
        int j=0;
        int platform=1;
        int max=1;
        while(i<n){
            if(at[i]<=dt[j]){
                platform++;
                i++;
            }
            else if(at[i]>dt[j]){
                platform--;
                j++;
            }
            max=Math.max(max,platform);
        }
        return max;
    }
}  
