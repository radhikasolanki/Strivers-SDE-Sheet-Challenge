import java.util.* ;
import java.io.*; 
public class Solution {
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        if(m<n){
            return -1;
        }
        int  maxTime =Integer.MIN_VALUE;
        long sumOfArr=0;
        for(int i=0;i<m;i++){
            sumOfArr+=time[i];
            maxTime=Math.max(maxTime,time[i]);
        }
                
        long s=maxTime;
        long e=sumOfArr;
        long  res=-1;
        
        while(s<=e){
            long mid=s+(e-s)/2;
            if(isValid(time,n,m,mid)){
                res=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        
        return res;
    }
    
    public static boolean isValid(int time[],int n, int m, long max){
        long day =1;
        long sum=0;
        for(int i=0;i<m;i++){
            sum+=time[i];
            if(sum>max){
                day++;
                sum=time[i];
            }
            
            if(day>n){
                return false;
            }
        }
        return true;
    }
}
