class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0,n=nums.length,ans=Integer.MAX_VALUE;
        int sum=0;
        for(;r<n;r++){
            sum+=nums[r];
            for(;sum>=target;l++){
                ans=Math.min(ans,r-l+1);
                sum-=nums[l];
            }
        }
        if(ans==Integer.MAX_VALUE)     return 0;
        return ans;
    }
}