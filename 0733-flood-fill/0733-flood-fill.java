class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int oldColor, int color){
        // check base conditions
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor || image[sr][sc] == color) return;
        // color image
        image[sr][sc] = color;
        // call dfs on all 4 directions
        dfs(image, sr + 1, sc, oldColor, color);
        dfs(image, sr - 1, sc, oldColor, color);
        dfs(image, sr, sc + 1, oldColor, color);
        dfs(image, sr, sc - 1, oldColor, color);
    }  
}