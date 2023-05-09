class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l=0,e=0,n=nums.length,ans=0;
        int sum=0;
        Arrays.sort(nums);
        for(;e<n;e++){
            sum+=nums[e];
            for(;nums[e]*(e-l+1)-sum>k;l++){
                sum-=nums[l];
            }
            ans=Math.max(ans,e-l+1);
        }
        return ans;
    }
}