import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int m=mat.size();
        int n=mat.get(0).size();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((mat.get(i).get(j))==target)
                return true;
            }
        }
        return false;
    }
}
