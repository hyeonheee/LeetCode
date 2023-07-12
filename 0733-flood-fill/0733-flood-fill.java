class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc]==color)
            return image;
        
        int startColor=image[sr][sc];
        
        fill(image,sr,sc,startColor,color);
        return image;
    }

    public void fill(int [][] image, int sr, int sc, int startColor, int Color){
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||image[sr][sc]!=startColor){
            return;
        }

        image[sr][sc]=Color;

        fill(image,sr-1,sc,startColor,Color);
        fill(image,sr+1,sc,startColor,Color);
        fill(image,sr,sc-1,startColor,Color);
        fill(image,sr,sc+1,startColor,Color);
    }
}