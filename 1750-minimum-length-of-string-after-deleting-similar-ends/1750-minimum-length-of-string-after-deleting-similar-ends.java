class Solution {
    public int minimumLength(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right && s.charAt(left) == s.charAt(right)) {
            char ch = s.charAt(left);

            // Find the non-empty prefix
            while (left <= right && s.charAt(left) == ch) {
                left++;
            }

            // Find the non-empty suffix
            while (left <= right && s.charAt(right) == ch) {
                right--;
            }
        }

        return right - left + 1;
    }
}