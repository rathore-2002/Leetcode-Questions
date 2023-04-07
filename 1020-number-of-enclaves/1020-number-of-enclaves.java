class Solution {
    int rows, cols;
    public int numEnclaves(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int count = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if((i==0 || j==0 || i==rows-1 || j==cols-1) && grid[i][j] == 1){ 
				// to find out all boundary cells having 1s and excecuting dfs to convert all to 0
                    dfs(grid, i, j);            //to change all cells of current island 
                                                // to 0
                }
            }
        }
        
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j] == 1)count++;    // counting the number of cells still having 1
            }
        }
        return count;
    }
    
    private void dfs(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=rows || j>=cols || grid[i][j] == 0)return;
        
        grid[i][j] = 0;
		// marking the cell 0 as we have already visited it
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
        
    }
}