class Solution {
    public int maxProduct(int[] nums) {
        int large=0,secLarge=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                secLarge=large;
                large=nums[i];
            }
            else if(nums[i]>secLarge)       secLarge=nums[i];
        }
        return (large-1)*(secLarge-1);
    }
}