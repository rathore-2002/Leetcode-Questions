class Solution {
    public int dieSimulator(int n, int[] rollMax) {
        int[][] dp = new int[6][15];
        int modval = (int) Math.pow(10, 9) + 7;
        
        //first roll
        for(int i = 0; i < 6; i++) {
            dp[i][0] = 1;
        }

        for(int i = 1; i < n; i++) { //roll number
            long[] rowsum = new long[6];
            for(int r = 0; r < 6; r++) { //roll value
                for(int c = rollMax[r]-1; c >= 0; c--) { //consecutive roll count
                    rowsum[r] += dp[r][c];
                    rowsum[r] = rowsum[r] % modval;
                    if(c != 0) {
                        dp[r][c] = dp[r][c-1];
                    }
                }
            }

            //calculate new first column
            for(int j = 0; j < 6; j++) {
                long newroll = 0;
                for(int k = 0; k < 6; k++) {
                    if(k != j) newroll += rowsum[k];
                }
                newroll = newroll % modval;
                dp[j][0] = (int) newroll;
            }
        }

        long total = 0;
        for(int r = 0; r < 6; r++) {
            for(int c = 0; c < 15; c++) {
                total += dp[r][c];
                total = total % modval;
            }
        }
        return (int) total;
    }
}