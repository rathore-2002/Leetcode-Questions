class Solution {
    int[][][] dp;
    public int cherryPickup(int[][] grid) {
        dp=new int[grid.length][grid[0].length][grid[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                for(int k=0;k<dp[i][j].length;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return rec(grid,0,0,grid[0].length-1);
    }
    public int rec(int[][] grid,int level,int c1,int c2){
        // base case and pruning code
        if(level>=grid.length || c1>=grid[0].length || c2>=grid[0].length || c1<0 || c2<0){
            return 0;
        }

        if(dp[level][c1][c2]!=-1)
        return dp[level][c1][c2];

        int max=Integer.MIN_VALUE;
        for(int di=-1;di<=1;di++){
            for(int dj=-1;dj<=1;dj++){
                int cherry=0;
                if(c1==c2){
                    cherry=grid[level][c1];
                }else{
                    cherry=grid[level][c1]+grid[level][c2];
                }
                max=Math.max(max,cherry+rec(grid,level+1,c1+di,c2+dj));
            }
        }
        return dp[level][c1][c2]=max;
    }
}