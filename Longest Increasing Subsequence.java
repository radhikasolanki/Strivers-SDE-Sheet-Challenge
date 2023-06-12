public class Solution {
    public static int ceilIndex(int tail[],int l,int r,int x)
    {
        while(l<r)
        {
            int m=(l+r)/2;
            if(tail[m]>=x)
                r=m;
            else 
                l=m+1;
        }
        return r;
    }
    public static int longestIncreasingSubsequence(int arr[]) {
        //Your code goes here
       int tail[]=new int[arr.length];
        tail[0]=arr[0];
        int len=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>tail[len-1])
            {
                tail[len]=arr[i];
                len++;
            }
            else {
                int c=ceilIndex(tail,0,len-1,arr[i]);
                tail[c]=arr[i];
            }

        }
        return len;
    }

 

}
