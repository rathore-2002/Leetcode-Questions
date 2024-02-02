class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        int digitsLow = (int) Math.log10(low) + 1;
        int digitsHigh = (int) Math.log10(high) + 1;
        String superset = "123456789";

        for (int i = digitsLow; i <= digitsHigh; i++) {
            for (int j = 0; j <= 9 - i; j++) {
                String subString = superset.substring(j, j + i);
                int num = Integer.parseInt(subString);
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}