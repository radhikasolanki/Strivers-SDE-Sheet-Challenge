import java.util.* ;
import java.io.*; 
public class Solution{
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		// Write your code here.
		 PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>(k);
        for (int i = 0; i < k; i++) {
            minQueue.add(Integer.MIN_VALUE);
        }
        for (int aValue : a) {
            for (int bValue : b) {
                int sum = aValue + bValue;
                if (minQueue.peek() < sum) {
                    minQueue.poll();
                    minQueue.add(sum);
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>(k);
        while (!minQueue.isEmpty()) {
            result.add(minQueue.poll());
        }
        Collections.reverse(result);
        return result;
	
	}
}

// 1 3 5
// 2 4 6