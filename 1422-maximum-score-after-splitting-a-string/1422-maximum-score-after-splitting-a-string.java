public class Solution {
    public int maxScore(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            int currentScore = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(j) == '0') {
                    currentScore++;
                }
            }

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    currentScore++;
                }
            }

            result = Math.max(result, currentScore);
        }

        return result;
    }
}
