class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3){
            return nums.length;
        }
        
        int len = nums.length;
        int count = 2;//count is the actual index in which we will be storing value
        for(int i = 2;i<len;i++){
            if(nums[i] != nums[count - 2])//that means unique value found so place it in correct index
            {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}