class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for (int i = 0; i<nums.length; i++) {
            map.put(sum, map.getOrDefault(sum, 0)+1);
            sum += nums[i];
            if (map.containsKey(sum-goal)) 
                ans += map.get(sum-goal);
        }
        return ans;
    }
}