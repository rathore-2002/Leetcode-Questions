class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        for(int i=1; i<n; i++){
            if(i >= 2){
                dp[i]= Math.max(dp[i],Math.max(nums[i]+dp[i-2],dp[i-1]));
            }else{
                dp[i]=Math.max(nums[i],dp[i-1]);
            }
        }
        return dp[n-1];
    }
}