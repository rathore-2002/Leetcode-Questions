class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int j=-1,i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0)
                count++;
            if(count>k){
                j++;
                if(nums[j]==0)
                    count--;
            }
        }
        return i-j-1;
    }
}