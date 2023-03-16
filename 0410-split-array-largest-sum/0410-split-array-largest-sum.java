public class Solution {
    public int splitArray(int[] nums, int m) {
        int low = Arrays.stream(nums).max().getAsInt();;
        int high = Arrays.stream(nums).sum();;
        int ans = 0;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(isPossible(nums,mid,m)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }

    private boolean isPossible(int[] nums, int mid, int m) {
        int split = 1;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > mid){
                split ++;
                sum = nums[i];
            }
        }
        return split<=m;
    }

}