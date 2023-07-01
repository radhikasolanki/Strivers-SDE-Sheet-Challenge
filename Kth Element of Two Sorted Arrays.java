import java.util.*;
public class Solution {
    public static int ninjaAndLadoos(int arr1[], int arr2[], int n, int m, int k) {
//         // Write your code here.
//         ArrayList<Integer> cont = new ArrayList<>();
//        for(int i=0;i<row1.length;i++)
//            cont.add(row1[i]);
//         for(int i=0;i<row2.length;i++)
//            cont.add(row2[i]);
//         Collections.sort(cont);
//         int res = cont.get(k-1);
//         return res;        
        if(n>m)
            return ninjaAndLadoos(arr2,arr1,m,n,k);
        int low = Math.max(0,k-m),high=Math.min(k,n);
        
        while(low<=high){
            int cut1 = (low+high)>>1;
            int cut2 = k-cut1;
            int l1 = cut1==0?Integer.MIN_VALUE:arr1[cut1-1];
            int l2 = cut2==0?Integer.MIN_VALUE:arr2[cut2-1];
            int r1 = cut1==n?Integer.MAX_VALUE:arr1[cut1];
            int r2 = cut2==m?Integer.MAX_VALUE:arr2[cut2];            
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                high = cut1-1;
            }
            else{
                low = cut1+1;
            }
        }
        return 1;
    }
}
