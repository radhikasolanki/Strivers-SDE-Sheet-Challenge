import java.util.* ;
import java.io.*; 

public class Solution {

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        // Write your code here.
       PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
       ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
           if(q[i][0]==0){
               pQueue.add(q[i][1]);
               
           } 
            else{
                ans.add(pQueue.poll());
            }
        }
//         Integer[] res = new Integer[ans.size()];
//         res=ans.toArray(res);
//         for(int i=0;i<ans.size();i++){
//             res[i]=ans.get(i);
//         }
        int[] res = ans.stream().mapToInt(i -> i).toArray();
        return res;
    }
}
