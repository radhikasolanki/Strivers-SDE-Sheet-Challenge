import java.util.* ;
import java.io.*; 
public class Solution {
    public static int distinctSubstring(String word) {
        // Write your code here.
        Set<String> set=new HashSet<>();
        for(int i=0;i<word.length();i++ ){
            for(int j=i;j<word.length();j++){
                String s=word.substring(i,j+1);
                set.add(s);
            }
        }
        return set.size();
    }
}
