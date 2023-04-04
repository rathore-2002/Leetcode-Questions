class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,r=0,n=nums.length,ans=0;
        int count=0;
        for(;r<n;r++){
            if(nums[r]==0)     count++;
            for(;count>1;l++){
                if(nums[l]==0)  count--;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans-1;
    }
}