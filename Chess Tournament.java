import java.util.* ;
import java.io.*; 
public class Solution {

    public static int chessTournament(int[] positions, int n,  int c) 
	{
        // Write your code here.   
        Arrays.sort(positions);
        int low =1,high=positions[n-1]-positions[0];
        int res =-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(fun(positions,mid,c)){
                res = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;
    }
  public static boolean fun(int[] positions,int Dist,int totalPlayer){
      int player = 1,recent=positions[0];
      
      for(int i=1;i<positions.length;i++){
          if(positions[i]-recent>=Dist){
              player++;
              recent=positions[i];
          }
      }
      if(player<totalPlayer)
          return false;
      return true;
  }
}
