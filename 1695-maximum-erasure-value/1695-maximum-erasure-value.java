class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0,e=0,n=nums.length,ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for(;e<n;e++){
            sum+=nums[e];
            map.put(nums[e],map.getOrDefault(nums[e],0)+1);
            for(;map.get(nums[e])>1;l++){
                sum-=nums[l];
                if(map.get(nums[l])==1)       map.remove(nums[l]);
                else                          map.put(nums[l],map.get(nums[l])-1);
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}