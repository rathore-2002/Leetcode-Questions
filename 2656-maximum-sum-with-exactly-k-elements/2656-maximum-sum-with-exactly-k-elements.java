class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=nums[nums.length-1];
        int n=sum;
        for(int i=1;i<k;i++){
            sum+=(n+i);
        }
        return sum;
    }
}