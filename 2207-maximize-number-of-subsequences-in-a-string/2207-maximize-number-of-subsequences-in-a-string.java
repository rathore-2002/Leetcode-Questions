class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        long result = 0, first = 0, second = 0;

        for(int i = 0; i < text.length(); ++i) {
            if(text.charAt(i) == pattern.charAt(1)) {
                result += first;
                second++;
            }
            
            if(text.charAt(i) == pattern.charAt(0))
                first++;
        }

        return result + Math.max(first, second);
    }
}