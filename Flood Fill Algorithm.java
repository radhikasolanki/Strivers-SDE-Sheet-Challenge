public class Solution
{
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Write your code here
        int n=image.length;
        int m=image[0].length;
        int color = image[sr][sc];
        if(color!=newColor){
            dfs(image,sr,sc,color,newColor);
        }
        return image;
    }
    
    public static void dfs(int[][]image, int r, int c, int color, int newColor){
        if(r>=0 && c>=0 && r<image.length && c<image[0].length && image[r][c]==color){
            image[r][c]=newColor;
            dfs(image,r+1,c,color,newColor);
            dfs(image,r-1,c,color,newColor);
            dfs(image,r,c+1,color,newColor);
            dfs(image,r,c-1,color,newColor);
        }
    }
}

