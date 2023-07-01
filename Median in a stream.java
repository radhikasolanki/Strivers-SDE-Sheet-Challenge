import java.util.*;
public class Solution {
    public static int[] findMedian(int[] arr, int n) {
        // Write your code here.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        
       boolean even = true;
        for(int i=0;i<n;i++){
            if(even){
                minHeap.add(arr[i]);
                maxHeap.add(minHeap.poll());
            }
            else{
                maxHeap.add(arr[i]);
                minHeap.add(maxHeap.poll());
            }
            even = !even;
            
            if(even){
                ans.add((minHeap.peek()+maxHeap.peek())/2);
            }
            else{
               ans.add(maxHeap.peek());
            }
        }  
        int a[]=new int[ans.size()];
        int j=0;
        for(int i:ans){
            a[j]=i;
            j++;
        }
         return a;
    }
}
