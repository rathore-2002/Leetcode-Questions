class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,e=0,n=nums.length,ans=0;
        int prod=1;
        for(;e<n;e++){
            prod*=nums[e];
            for(;prod>=k && l<=e;l++){
                prod/=nums[l];
            }
            ans+=(e-l+1);
        }
        return ans;
    }
}