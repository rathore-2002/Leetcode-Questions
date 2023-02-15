class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int cost[][]=new int[m][n];
        cost[0][0]=grid[0][0];
        for(int i=1;i<m;i++)
            cost[i][0]=cost[i-1][0]+grid[i][0];
        for(int i=1;i<n;i++)
            cost[0][i]=cost[0][i-1]+grid[0][i];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                cost[i][j]=Math.min(cost[i-1][j],cost[i][j-1])+grid[i][j];
            }
        }
        return cost[m-1][n-1];
    }
}