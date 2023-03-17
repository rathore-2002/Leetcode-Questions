class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s=1,e=0,ans=0;
        for(int i : nums)
            e=Math.max(e,i);
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isPossible(nums,mid,threshold)){
                ans=mid;
                e=mid-1;
            }
            else                 s=mid+1;
        }
        return ans;
    }
    private boolean isPossible(int nums[], int mid, int x){
        int s=0;
        for(int i : nums){
            s+=(int)Math.ceil(i*1.0/mid);
        }
        if(s<=x)        return true;
        return false;
    }
}