class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        // Create a map to store the remainder of each sum
        // Key is the remainder, value is the number of times it appears
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with 0 remainder and count 1

        for (int num : nums) {
            sum += num;
            // Find remainder of sum when divided by k
            int remainder = (sum % k + k) % k; 
            // If the remainder already exists in the map, add its count to the result
            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }
            // Add remainder to the map or increase its count
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}