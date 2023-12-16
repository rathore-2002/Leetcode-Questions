class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int s=0,e=0,n=nums.length,ans=0;
        int count=0;
        for(;e<n;e++){
            if(nums[e]==0)  count++;
            for(;count>0;s++){
                if(nums[s]==0)   count--;
            }
            ans=Math.max(ans,e-s+1);
        }
        return ans;
    }
}