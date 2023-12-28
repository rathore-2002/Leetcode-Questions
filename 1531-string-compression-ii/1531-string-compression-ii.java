class Solution {
  public int getLengthOfOptimalCompression(String s, int k) {
    dp = new int[s.length()][k + 1];
    Arrays.stream(dp).forEach(A -> Arrays.fill(A, kMax));
    return compression(s, 0, k);
  }

  private static final int kMax = 101;
  private int[][] dp;

  private int compression(final String s, int i, int k) {
    if (k < 0)
      return kMax;
    if (i == s.length() || s.length() - i <= k)
      return 0;
    if (dp[i][k] != kMax)
      return dp[i][k];

    int maxFreq = 0;
    int[] count = new int[128];
    for (int j = i; j < s.length(); ++j) {
      maxFreq = Math.max(maxFreq, ++count[s.charAt(j)]);
      dp[i][k] = Math.min( 
          dp[i][k],        
          getLength(maxFreq) + compression(s, j + 1, k - (j - i + 1 - maxFreq)));
    }

    return dp[i][k];
  }
  private int getLength(int maxFreq) {
    if (maxFreq == 1)
      return 1; 
    if (maxFreq < 10)
      return 2; 
    if (maxFreq < 100)
      return 3; 
    return 4;  
  }
}