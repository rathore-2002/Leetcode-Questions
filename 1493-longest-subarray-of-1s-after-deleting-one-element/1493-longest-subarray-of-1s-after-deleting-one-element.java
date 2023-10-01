class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,e=0,n=nums.length,ans=0;
        int count=0;
        for(;e<n;e++){
            if(nums[e]==0)   count++;
            for(;count>1;l++){
                if(nums[l]==0)     count--;
            }
            ans=Math.max(ans,e-l+1);
        }
        return ans-1;
    }
}