class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0,e=0,n=nums.length,ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int score=0;
        for(;e<n;e++){
            score+=nums[e];
            // if(!map.contains(nums[e]))        score+=nums[e];
            map.put(nums[e],map.getOrDefault(nums[e],0)+1);
            for(;map.get(nums[e])>1;l++){
                map.put(nums[l],map.get(nums[l])-1);
                score-=nums[l];
            }
            ans=Math.max(ans,score);
        }
        return ans;
    }
}