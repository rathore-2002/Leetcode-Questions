class Solution {
    public int minScoreTriangulation(int[] values) {
        
        int n = values.length;
        int dp[][] = new int[n][n];
        
        
        for (int i=n-1;i>=1;i--){
            for (int j=i+1;j<n;j++){
                int mini = Integer.MAX_VALUE;
                // for partition
                for (int k=i;k<=j-1;k++){
                    int steps = values[i-1] * values[k] * values[j] + dp[i][k] + dp[k+1][j];
                    mini = Math.min(mini,steps);
                }
                dp[i][j] = mini;
            }
        }
        return dp[1][n-1];
        
    }
}