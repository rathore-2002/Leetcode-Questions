class Solution {
    public static boolean travel(int[][] grid,int i,int j){
        if(grid[i][j]==1)return true;
        grid[i][j]=1;
        if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1){
            return false;
        }
       boolean one=travel(grid,i+1,j);
       boolean two=travel(grid,i-1,j);
       boolean three=travel(grid,i,j+1);
       boolean four=travel(grid,i,j-1);
       return (one && two && three && four);
    }
    public int closedIsland(int[][] grid) {
    int count=0;
        for(int i=1;i<grid.length-1;i++){
            for(int j=1;j<grid[0].length-1;j++){
                if(grid[i][j]==0){
                    if(travel(grid,i,j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}