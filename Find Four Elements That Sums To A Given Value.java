import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Arrays.sort(arr);
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          int k=j+1;
          int l=n-1;
          while(k<l){
            if(arr[i]+arr[j]+arr[k]+arr[l]==target){
              return "Yes";
            }
            else if(arr[i]+arr[j]+arr[k]+arr[l]<target){
              k++;
            }
            else{
              l--;
            }
          }
        }
      }
      return "No";
  }
}
