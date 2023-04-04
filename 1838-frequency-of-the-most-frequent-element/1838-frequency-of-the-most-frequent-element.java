class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l=0,r=0,n=nums.length;
        long ans=0;
        Arrays.sort(nums);
        long sum=0;
        for(;r<n;r++){
            sum+=nums[r];
            for(;nums[r]*(r-l+1)-sum>k;l++){
                sum-=nums[l];
            }
            ans=Math.max(ans,(r-l+1));
        }
        return (int)ans;
    }
}