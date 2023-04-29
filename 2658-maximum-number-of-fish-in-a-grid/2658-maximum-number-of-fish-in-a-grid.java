class Solution {
    int count=0;
    public int findMaxFish(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]>0){
                    removeIsland(grid,i,j);
                    max=Math.max(max,count);
                    count=0;
                }    
            }
        }
        return max;
    }
    
    private void removeIsland(int[][] grid,int i,int j){
        if(i==-1||j==-1||i==grid.length||j==grid[i].length||grid[i][j]==0)
            return;
        count+=grid[i][j];
        grid[i][j]=0;
        removeIsland(grid,i-1,j);
        removeIsland(grid,i+1,j);
        removeIsland(grid,i,j-1);
        removeIsland(grid,i,j+1);    
    }
}