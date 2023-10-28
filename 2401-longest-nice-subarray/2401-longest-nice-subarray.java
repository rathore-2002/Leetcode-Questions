class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max = 1;
        int left = 0;
        int right = 0; 
        int subarrayOR = 0; 

        while(right < nums.length)
        {
            while((subarrayOR & nums[right]) != 0)
            {
                subarrayOR ^= nums[left];
                left++;
            }

            subarrayOR |= nums[right];
            
            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }
}