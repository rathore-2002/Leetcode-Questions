class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0,r=0,n=nums.length,ans=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(;r<n;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            sum+=nums[r];
            for(;map.get(nums[r])>1;l++){
                map.put(nums[l],map.get(nums[l])-1);
                sum-=nums[l];
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}