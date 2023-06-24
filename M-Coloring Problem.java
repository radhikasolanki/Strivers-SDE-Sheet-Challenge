import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean isPossible(int ind,int[][]mat,int m, int[]col){
		for(int i=0;i<mat.length;i++){
			if(i!=ind && mat[ind][i]==1 && col[i]==m)return false;
		}
		return true;
	}
	public static boolean fun(int ind, int[][]mat, int m,int[]col){
              if(ind==mat.length){
				  return true;
			  }
			  for(int i=1;i<=m;i++){
				  if(isPossible(ind,mat,i,col)){
					  col[ind]=i;
					  if(fun(ind+1,mat,m,col))return true;
					  col[ind]=0;
				  }
			  }
			  return false;

	}
	public static String graphColoring(int[][] mat, int m) {
		// Write your code here
		int n=mat.length;
		
		int[]col=new int[n];
		//Arrays.fill(col,-1);
		if(fun(0,mat,m,col)==true)return "YES";
		return "NO";
	}
}
