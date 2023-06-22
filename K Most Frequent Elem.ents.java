import java.util.* ;
import java.io.*; 

class Pair{
	int k;
	int v;
	Pair(int k, int v){
		this.k=k;
		this.v=v;
	}
}
public class Solution {

	public static int[] KMostFrequent(int n, int k, int[] arr) {
		// Write your code here.
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		Pair[] p=new Pair[map.size()];
		int i=0;
		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
			p[i++]=new Pair(entry.getKey(),entry.getValue());
		}
		Arrays.sort(p, new Comparator<Pair>() {
			public int compare(Pair a, Pair b){
				return b.v-a.v;
			}
		});
		int[]ans=new int[k];
		for(int j=0;j<k;j++){
			ans[j]=p[j].k;
		}
		return ans;

	}

}
