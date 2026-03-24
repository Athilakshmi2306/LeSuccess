class Solution {
    static void backtrack(int[][] img,int sr,int sc,int color,int num){
    if(sr<0 || sc<0 || sr>=img.length || sc>=img[0].length ||img[sr][sc]!=num )
    {
       return ;   
    }
    img[sr][sc]=color;
    backtrack(img,sr+1,sc,color,num);
    backtrack(img,sr-1,sc,color,num);
    backtrack(img,sr,sc+1,color,num);
    backtrack(img,sr,sc-1,color,num);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int num=image[sr][sc];
        if(num==color)
        return image;
    
    backtrack(image,sr,sc,color,num);
    return image;
}
}