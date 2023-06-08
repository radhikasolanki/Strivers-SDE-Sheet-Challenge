import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int ct_zero=0;
        int ct_one=0;
        int ct_two=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                ct_zero++;
            }
            else if(arr[i]==1){
                ct_one++;
            }
            else{
                ct_two++;
            }
        }
        int i=0;
        while(ct_zero!=0){
            arr[i++]=0;
            ct_zero--;
        }
        while(ct_one!=0){
            arr[i++]=1;
            ct_one--;
        }
        while(ct_two!=0){
            arr[i++]=2;
            ct_two--;
        }
    }
}
