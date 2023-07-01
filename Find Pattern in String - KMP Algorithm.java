import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean findPattern(String p, String s) {
        // Write your code here.
        int n=p.length();
        int m=s.length();
        int target=sum(p);
        int source=sum(s.substring(0,n));
        for(int i=0;i<m-n+1;i++)
        {
           if(i!=0)
               source+=s.charAt(i+n-1)-s.charAt(i-1);
            if(target==source)
            {
                int j=0,k=i;
                while(j<n && s.charAt(k)==p.charAt(j))
                {
                    j++;k++;
                }
                if(j==n)
                    return true;
            }
        }
        return false;
    }
    public static int sum(String a)
    {
        int max=0;
        for(int i=0;i<a.length();i++)
        {
            max+=a.charAt(i)-'a';
        }
        return max;
    }
}
