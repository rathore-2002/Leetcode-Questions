class Solution {
    int count = 0;
    public int uniquePathsIII(int[][] grid) {
        int blocks = 1;
        for(int[] arr:grid) for(int a:arr) if(a==0) blocks++;
        for(int i=0;i<grid.length;i++) for(int j=0;j<grid[0].length;j++) if(grid[i][j] == 1) dfs(grid,i,j,blocks);
        return count;
    }
    public void dfs(int[][] grid,int i,int j,int blocks){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == -1 || grid[i][j] == -2) return;
        if(grid[i][j] == 2 && blocks == 0){
            count++;
            return;
        }
        if(grid[i][j] == 2) return;
        grid[i][j] = -2;
        dfs(grid,i-1,j,blocks-1);
        dfs(grid,i,j+1,blocks-1);
        dfs(grid,i+1,j,blocks-1);
        dfs(grid,i,j-1,blocks-1);
        grid[i][j] = 0;
    }
}