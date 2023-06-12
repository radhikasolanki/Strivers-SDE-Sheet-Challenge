import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String s) 
    {
		//write your code here
		int[]arr=new int[256];
		Arrays.fill(arr,-1);
		int left=0;
		int right=0;
		int len=0;
		while(right<s.length()){
			if(arr[s.charAt(right)-'a']!=-1){
				left=Math.max(arr[s.charAt(right)-'a']+1,left);
			}
			arr[s.charAt(right)-'a']=right;
			len=Math.max(len,right-left+1);
			right++;
		}
		return len;

		
	}
}
