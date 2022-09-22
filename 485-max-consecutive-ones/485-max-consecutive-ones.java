class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int k = 0;
for (int i = 0; i <= nums.length - 1; i++) {
	if (nums[i] == 1){
		k++;
		if (i == nums.length-1&&k>nums[0])
			return k;
	} else if (k > nums[0]) {
		nums[0] = k;
		k =0;
	} else k = 0;
}
return nums[0];
    }
}