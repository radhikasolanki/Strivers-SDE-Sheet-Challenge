import java.util.* ;
import java.io.*; 
/*
	This is signature of helper function 'knows'.
	You should not implement it, or speculate about its implementation.

	boolean knows(int A, int B); 
	Function 'knows(A, B)' will returns "true" if the person having
	id 'A' know the person having id 'B' in the party, "false" otherwise.
	Use it as Runner.knows(A, B);
*/
	

public class Solution {
    public static int findCelebrity(int n) {
        // Write your code here.
        Stack<Integer> stk = new Stack<>();
        
        int ii = 0 ;
        
        while(ii<n)
            stk.push(ii++);
        
        while(stk.size() > 1)
        {
            int A = stk.pop();
            int B = stk.pop();
            
            if(Runner.knows(A, B))
                stk.push(B);
                
            else if(Runner.knows(B, A))
                stk.push(A);
        }
        if(stk.isEmpty()) return -1;
        int p = stk.pop();
        
        boolean ans = true;
        
        for(int i=0;i<n;i++)
        {
           if(i==p) continue;
           
           if(!Runner.knows(i,p)) 
           {
              // System.out.println("here");
               ans = false;
               break;
           }   
               
        }
        
        for(int i=0;i<n;i++)
        {
            if(Runner.knows(p,i)) 
           {
               ans = false;
               break;
           }     
           
        }
        
        if(ans) return p;
        return -1;
    }
    
}
