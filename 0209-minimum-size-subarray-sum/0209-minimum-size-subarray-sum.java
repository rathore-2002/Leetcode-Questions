class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,e=0,n=nums.length,ans=Integer.MAX_VALUE;
        int sum=0;
        for(;e<n;e++){
            sum+=nums[e];
            for(;sum>=target;l++){
             ans=Math.min(ans,e-l+1);
                sum-=nums[l];
            }
           
        }
        if(ans==Integer.MAX_VALUE)         return 0;
        return ans;
    }
}