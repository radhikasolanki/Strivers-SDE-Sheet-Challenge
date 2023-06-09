import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(int xx, int n, int m) {
        // Write your code here.   
        int nn=n;
        long res=1%m;
        long x=xx%m;
        while(nn>0){
             if(nn%2==0){
                 x=((x%m)*(x%m))%m;
                 nn=nn/2;
             }
             else{
                 res=((res%m)*(x%m))%m;
                 nn=nn-1;
             }
        }
        return (int)(res%m);     
    }
}
