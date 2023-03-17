class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0; 
        
         int n=nums.length;
        
        if(nums[0] > nums[1])     return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        
        int s=1,e=nums.length-2;
       
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])     return mid;
            else if(nums[mid] < nums[mid-1])                  e=mid-1;
            else if(nums[mid] < nums[mid+1])                  s= mid+1;
        }
        return -1;
    }
}

