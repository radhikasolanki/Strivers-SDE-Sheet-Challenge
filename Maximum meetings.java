import java.util.* ;
import java.io.*; 
class Pair{
    int start;
    int end;
    int ind;
    Pair(int start, int end, int ind){
        this.start=start;
        this.end=end;
        this.ind=ind;
    }
}
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
        List<Integer> list=new ArrayList<>();
        if(start.length==0)return list;
        
        Pair[] arr=new Pair[start.length];
        for(int i=0;i<start.length;i++){
            arr[i]=new Pair(start[i],end[i],i+1);
        }
        // Arrays.sort(arr,new Comparator<Pair>() {
        //     public int compare(Pair a, Pair b){
        //         return a.end-b.end;
        //     }
        // });
        Arrays.sort(arr,(a,b)->a.end-b.end);
       // int s=arr[0].start;
        int e=arr[0].end;
        int i=arr[0].ind;
        list.add(i);

        for(int j=1;j<start.length;j++){
            if(e<arr[j].start){

                list.add(arr[j].ind);
                e=arr[j].end;
            }
        }
        return list;
    }
}
