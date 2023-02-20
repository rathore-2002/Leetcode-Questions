class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target)  return m;
            else if(nums[m]<target)  s=m+1;
            else  e=m-1;
        }
        return s;
    }
}