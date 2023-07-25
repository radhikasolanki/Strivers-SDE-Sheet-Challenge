import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int compareVersions(String a, String b) 
    {
        // Write your code here
         int m=a.length();
        int n=b.length();
        int i=0,j=0;
        long a1=0,b1=0;
        while(i<a.length() && j<b.length())
        {
            a1=0;b1=0;
            while(i<a.length())
            {
                if(a.charAt(i)=='.')
                {
                    i++;break;
                }
                a1=a1*10+(a.charAt(i)-'0');
                i++;
            }
            while(j<b.length())
            {
                if(b.charAt(j)=='.')
                {
                    j++;break;
                }
                b1=b1*10+(b.charAt(j)-'0');
                j++;
            }
            if(a1>b1)
            {
               // System.out.println(a1+".."+b1);
                return 1;
            }
            else if(a1<b1)
                return -1;
        }
        while(i<a.length())
        {
            a1=0;b1=0;
            while(i<a.length())
            {
                if(a.charAt(i)=='.')
                {
                    i++;
                    continue;
                }
                a1=a1*10+(a.charAt(i)-'0');
                i++;
            }
             
        }
        while(j<b.length())
        {
            a1=0;b1=0;
            while(j<b.length())
            {
                if(b.charAt(j)=='.')
                {
                    j++;continue;
                }
                b1=b1*10+(b.charAt(j)-'0');
                j++;
            }            
        }
        if(a1>b1)
        {
            //System.out.println(a1+".."+b1);
            return 1;
        }
            
        else if(a1<b1)
            return -1;
        return 0;
    }
}
