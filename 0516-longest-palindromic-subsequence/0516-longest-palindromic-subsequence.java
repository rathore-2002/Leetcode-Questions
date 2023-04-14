class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        return lps(s , rev);
    }
    public int lps(String sb,String rev){
        int a = sb.length();
        int b = rev.length();
        int[][] dp = new int[a+1][b+1];
        for(int i=0; i<a+1;i++){
            for(int j=0; j<b+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1; i<a+1;i++){
            for(int j=1; j<b+1;j++){
                if(sb.charAt(i-1) == rev.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                
                else
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return dp[a][b];
    }
}