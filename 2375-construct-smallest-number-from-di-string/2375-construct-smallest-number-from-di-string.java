class Solution {
    public static void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
        sb.replace(i + 1, j, new StringBuilder(sb.substring(i + 1, j)).reverse().toString());
    }
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder result = new StringBuilder();
        int currentNum = 1;
        for (int i = 0; i <= n; i++) {
            result.append(currentNum);
            currentNum++;
        }
        for (int i = 0; i < n; i++) {
            if (pattern.charAt(i) == 'D') {
                int j = i;
                while (j < n && pattern.charAt(j) == 'D') {
                    j++;
                }
                swap(result, i, j);
                i = j;
            }
        }
        return result.toString();
    }
}