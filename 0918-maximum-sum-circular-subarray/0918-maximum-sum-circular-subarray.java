class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0; 
        int minSubarraySum = Integer.MAX_VALUE, tempMinSum = 0;
        int maxSubarraySum = Integer.MIN_VALUE, tempMaxSum = 0;
        
        for (int n : nums) {
            totalSum += n;  

            
            tempMaxSum += n;
            maxSubarraySum = Math.max(maxSubarraySum, tempMaxSum);
            if (tempMaxSum < 0) tempMaxSum = 0;

            
            tempMinSum += n;
            minSubarraySum = Math.min(minSubarraySum, tempMinSum);
            if (tempMinSum > 0) tempMinSum = 0;
        }

        if (totalSum == minSubarraySum) {   
            return maxSubarraySum;
        }

        int maxCircularSubarraySum = totalSum - minSubarraySum;
        return Math.max(maxSubarraySum, maxCircularSubarraySum);
    }
}