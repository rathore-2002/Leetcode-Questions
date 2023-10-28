class Solution {
    public int minOperations(int[] nums, int x) {
        int l=0,e=0,n=nums.length,ans=Integer.MAX_VALUE;
        int sum=0,reqSum=0,windowSum=0;
        for(int i : nums)
            sum+=i;
        reqSum=sum-x;
        
        if(reqSum<0)      return -1;
        if(reqSum==0)     return n;
        
        for(;e<n;e++){
            windowSum+=nums[e];
            for(;windowSum>reqSum;l++){
                windowSum-=nums[l];
            }
            if(windowSum==reqSum)
                ans=Math.min(ans,n-(e-l+1));
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}