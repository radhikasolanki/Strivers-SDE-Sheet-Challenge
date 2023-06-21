import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        char[]a=str1.toCharArray();
        char[]b=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
    //    System.out.println(Arrays.toString(a));
    //    System.out.println(Arrays.toString(b));
        str1=new String(a);
        str2=new String(b);
        // System.out.println(str1);
        // System.out.println(str2);
        if(str1.equals(str2))return true;
        return false;
    }
}
