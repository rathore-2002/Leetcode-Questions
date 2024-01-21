class Solution {
    public int minCapability(int[] nums, int k) {
       int start =1;
        int ans = Integer.MAX_VALUE;
        int end = Integer.MAX_VALUE;
        while(start <= end){
            int count =0;
            int mid = start+(end-start)/2;
            int len = nums.length;
            for(int i=0;i<len;i++){
                if(nums[i]<=mid){
                    i++;
                    count++;
                }
            }
            if(count>=k){
                ans = Math.min(ans,mid);
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;  
    }
}