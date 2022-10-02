class Solution {
   private int helper(int[][] dp, int n, int k, int target) {
	
	if (target <= 0)
		return 0;
	
	if (n == 1) 
		return (k >= target) ? 1 : 0;
	int res = 0;
	if (dp[n][target] != -1)
		return dp[n][target];
	for (int i = 1; i <= k; ++i) 
		res = (int) ((res + helper(dp, n - 1, k, target - i)) % (1000000007));
	return dp[n][target] = res;
}

public int numRollsToTarget(int n, int k, int target) {
	
	int[][] dp = new int[n+1][target+1];
	for (int[] row : dp) 
		Arrays.fill(row, -1);
	return helper(dp, n, k, target);
}
}