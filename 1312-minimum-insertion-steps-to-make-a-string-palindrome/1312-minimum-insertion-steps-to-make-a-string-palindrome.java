class Solution {
  public int minInsertions(String s) {
    var n = s.length();
    var dp = new int[n];
    var dpPrev = new int[n];

    for (var i = n-1; i >= 0; i--) {
      dp[i] = 1;

      for (var j = i+1; j < n; j++) {
        dp[j] =
          s.charAt(i) == s.charAt(j)
          ? 2 + dpPrev[j-1]
          : Math.max(dpPrev[j], dp[j-1]);        
      }
      dpPrev = dp.clone();
    }
    return n - dp[n-1];
  }
}