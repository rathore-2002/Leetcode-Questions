class Solution {
    public int minDistance(String s, String t) {
    int n = s.length();
    int m = t.length();
    int[][] memo = new int[n+1][m+1];
    for(int i=0;i<=n;i++) {
        for(int j=0;j<=m;j++) {
            if(i==0||j==0) {
                memo[i][j]=i==0?j:i;
            }
            else if(s.charAt(i-1)==t.charAt(j-1)) {
                memo[i][j]=memo[i-1][j-1];
            } else {
                memo[i][j]=Math.min(memo[i][j-1],memo[i-1][j])+1;
            }
        }
    }
    return memo[n][m];
}
}