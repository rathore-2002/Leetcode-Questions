class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int i : nums)           set.add(i);
        
        int count=set.size();
        
        int l=0,e=0,n=nums.length,ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(;e<n;e++){
            map.put(nums[e],map.getOrDefault(nums[e],0)+1);
            while (map.size() == count) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
                ans += n - e;
            }
        }
        return ans;
    }
}