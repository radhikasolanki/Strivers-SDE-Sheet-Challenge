import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int max=Integer.MIN_VALUE;
        int buy=prices.get(0);
        for(int i=1;i<prices.size();i++){
            max=Math.max(max,prices.get(i)-buy);
            buy=Math.min(buy,prices.get(i));
        }
        if(max<0)return 0;
        return max;
    }
}
