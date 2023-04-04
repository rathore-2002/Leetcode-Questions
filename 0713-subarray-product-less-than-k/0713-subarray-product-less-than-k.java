class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,r=0,n=nums.length,ans=0;
        long prod=1;
        for(;r<n;r++){
            prod*=nums[r];
            for(;prod>=k && l<=r;l++){
                prod/=nums[l];
            }
            ans+=(r-l+1);
        }
        return ans;
    }
}