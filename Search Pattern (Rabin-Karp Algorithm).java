import java.util.List;
import java.util.*;

public class Solution {
    public static List< Integer > stringMatch(String text, String pattern){
        // Write your code here.
        List<Integer> res=new ArrayList<Integer>();
        int i=0;
        int j=pattern.length()-1;
        while(j<text.length()){
            if(text.substring(i,j+1).equals(pattern)){
                 res.add(i+1);
            }
            i++;
            j++;
        }
        return res;
    }
}
