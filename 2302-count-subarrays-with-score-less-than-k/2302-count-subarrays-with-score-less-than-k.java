class Solution {
    public long countSubarrays(int[] nums, long k) {
        int l=0,e=0,n=nums.length;
        long sum=0,ans=0;
        for(;e<n;e++){
            sum+=nums[e];
            for(;sum*(e-l+1)>=k;l++){
                sum-=nums[l];
            }
            ans+=(e-l+1);
        }
        return ans;
    }
}