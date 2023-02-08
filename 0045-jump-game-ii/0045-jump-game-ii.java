class Solution {
    public int jump(int[] nums) {
        int count = 0, end = 0, maxFar = nums[0];
        for ( int index = 0; index + 1 < nums.length; ++index ) {
            maxFar = Math.max(index + nums[index], maxFar);
            if ( index == end ) {
                ++count;
                end = maxFar;
            }
        }
        return count;
    }
}