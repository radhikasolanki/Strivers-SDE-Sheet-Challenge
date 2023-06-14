import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int[]coins=new int[]{1000,500,100,50,20,10,5,2,1};
        int count=0;
        for(int i=0;i<coins.length;i++){
            while(amount>=coins[i]){
                amount-=coins[i];
                count++;
            }
        }
        return count;
    }
}
