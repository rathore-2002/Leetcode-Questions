class Solution {
    public boolean check(int[] nums) {
        int ctr=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i])
                ctr++;
        }
        if(nums[nums.length-1]>nums[0])
            ctr++;
        
        return ctr<=1;
    }
}