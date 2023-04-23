class Solution {
  int n;
  int[] dp;

  private int numberOfArrays(String s, int k, int i) {
    if (i == n) return 1;
    if (s.charAt(i) == '0') return 0;

    if (dp[i] != 0) return dp[i];
    
    for (var j=i; j<n && Long.parseLong(s.substring(i, j+1)) <= k; j++) {
      dp[i] += numberOfArrays(s, k, j+1);
      dp[i] %= 1000000007;
    }
    return dp[i];
  }

  public int numberOfArrays(String s, int k) {
    n = s.length();
    dp = new int[n];

    return numberOfArrays(s, k, 0);
  }
}