class Solution {
  public int minDifference(int[] nums) {
    int length = nums.length;
    if (length <= 4) {
      return 0;
    }
    Arrays.sort(nums);
    int min = Integer.MAX_VALUE;
    min = Math.min(min, nums[length - 1] - nums[3]);
    min = Math.min(min, nums[length - 2] - nums[2]);
    min = Math.min(min, nums[length - 3] - nums[1]);
    min = Math.min(min, nums[length - 4] - nums[0]);
    return min;
  }
}