class Solution {
    Integer[][] memo;

    public int minDistance(String word1, String word2) {
        memo = new Integer[word1.length() + 1][word2.length() + 1];
        return backtrack(word1, word2, word1.length(), word2.length());
    }

    private int backtrack(String word1, String word2, int i, int j) {
        if (i == 0) return j;
        if (j == 0) return i;
        if (memo[i][j] != null) return memo[i][j];
        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
            return memo[i][j] = backtrack(word1, word2, i - 1, j - 1);
        } else {
            int del = backtrack(word1, word2, i - 1, j);
            int replace = backtrack(word1, word2, i - 1, j - 1);
            int insert = backtrack(word1, word2, i, j - 1);
            return memo[i][j] = Math.min(del, Math.min(replace, insert)) + 1;
        }
    }
}