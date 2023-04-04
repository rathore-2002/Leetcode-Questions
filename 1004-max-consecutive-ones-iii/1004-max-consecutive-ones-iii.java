class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,n=nums.length,ans=0;
        int count=0;
        for(;r<n;r++){
            if(nums[r]==0)     count++;
            for(;count>k;l++){
                if(nums[l]==0)  count--;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}