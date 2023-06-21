import java.util.ArrayList;

public class Solution {
  public static int largestRectangle(ArrayList < Integer > heights) {
    // Write your code here.
     int max=0;
       for(int i=0;i<heights.size();i++){
           int left=i;
           int right=i;
           while(left>=0 && heights.get(left)>=heights.get(i)){
               left--;

           }
           while(right<heights.size() && heights.get(right)>=heights.get(i)){
               right++;
           }
           int area=(right-left-1)*heights.get(i);
           max=Math.max(max,area);
       }
       return max;
  }
}
