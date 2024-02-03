class Solution {
    public int minimumBeautifulSubstrings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0')  continue;
            int cur = 0;
            for (int j = i; j < n; j++) {
                cur = cur * 2 + s.charAt(j) - '0';
                if (15625 % cur == 0) {
                    dp[j + 1] = Math.min(dp[j + 1], dp[i] + 1);
                }
            }
        }
        return dp[n] == n + 1 ? -1 : dp[n];
    }
}