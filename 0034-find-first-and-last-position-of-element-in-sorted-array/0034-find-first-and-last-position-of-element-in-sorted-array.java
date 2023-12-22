class Solution {
    public int[] searchRange(int[] nums, int target) {
       int f=first(nums,target);
        int l=last(nums,target);
        return new int[]{f,l};
    }
    public int first(int nums[],int target){
         int first=-1;
        int s=0,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                first=mid;
                e=mid-1;
            }
            else if(nums[mid]>target)          e=mid-1;
            else                               s=mid+1;
        }
        return first;
    }
    public int last(int nums[],int target){
         int last=-1;
        int s=0,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                last=mid;
                s=mid+1;
            }
            else if(nums[mid]>target)          e=mid-1;
            else                               s=mid+1;
        }
        return last;
    }
}