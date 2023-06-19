import java.util.Queue;

import java.util.LinkedList;




 class Pair{

    int f;

    int s;

    Pair(int first,int second){

        this.f=first;

        this.s=second;

    }

}




public class Solution 

{

    public static int getTotalIslands(int[][] mat) 

    {




        int n=mat.length;

        int m=mat[0].length;

        int vis[][]=new int[n][m];





        int count=0;

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                if(vis[i][j]==0 && mat[i][j]==1){

                    count++;

                    BFS(i,j,mat,vis);

                }

            }

        }

        return count;

    }




    public static void BFS(int i,int j,int[][] mat,int vis[][]){

        Queue<Pair>q=new LinkedList<Pair>();

        q.add(new Pair(i,j));

        vis[i][j]=1;




        int n=mat.length;

        int m=mat[0].length;




        while(!q.isEmpty()){

            int row=q.peek().f;

            int col=q.peek().s;

            q.remove();




            for(int k=-1;k<=1;k++){

                for(int l=-1;l<=1;l++){

                    int nrow=row+k;

                    int ncol=col+l;




                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && mat[nrow][ncol]==1 && 

                    vis[nrow][ncol]==0){

                        vis[nrow][ncol]=1;

                        q.add(new Pair(nrow, ncol));

                    }

                }

            }

        }

    }

}
