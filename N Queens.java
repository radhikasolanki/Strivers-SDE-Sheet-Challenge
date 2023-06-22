import java.util.*;
public class Solution {
    public static boolean isSafe(int row, int col,int[][]mat){
        int drow=row;
        int dcol=col;
        //left up diagonal
        while(row>=0 && col>=0){
            if(mat[row][col]==1)return false;
            row--;
            col--;
        }
        //left
        row=drow;
        col=dcol;
        while(col>=0){
            if(mat[row][col]==1)return false;
            col--;
        }
        //left down diagonal
        row=drow;
        col=dcol;
        while(row<mat.length && col>=0){
            if(mat[row][col]==1)return false;
            row++;
            col--;
        }
        return true;
    }

    public static void fun(int ind, int[][] mat, ArrayList<ArrayList<Integer>> list){
        if(ind==mat[0].length){
            //convert matrix array to arraylist
            ArrayList<Integer> ar = new ArrayList<>();
            for(int[]k:mat){
                for(int m=0;m<k.length;m++)
                    ar.add(k[m]);
                
            }
                list.add(ar);
                return;
        }
      //  for(int i=ind;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
               if(isSafe(j,ind,mat)){
                   mat[j][ind]=1;
                   fun(ind+1,mat,list);
                   mat[j][ind]=0;
               }
            }
       // }
    }
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int[][]mat=new int[n][n];
        fun(0,mat,list);
        return list;
    }
}
