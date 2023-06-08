import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        Arrays.sort(intervals,new Comparator<Interval>() {
            public int compare(Interval a,Interval b){
                return a.start-b.start;
            }
        });
      //  Arrays.sort(intervals,(a,b)->a.start-b.start);
        // for(int i=0;i<intervals.length;i++){
        //     System.out.println(intervals[i].start +" "+ intervals[i].finish);
        // }
        List<Interval> list=new ArrayList<>();
        int s=intervals[0].start;
        int f=intervals[0].finish;

        for(int i=1;i<intervals.length;i++){
            if(intervals[i].start<=f){
                f=Math.max(f,intervals[i].finish);
            }
            else{
                list.add(new Interval(s,f));
                s=intervals[i].start;
                f=intervals[i].finish;
            }
        }
        list.add(new Interval(s,f));
        return list;
    }
}
