class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        if(nums.length<3)
            return nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            
            set.add(nums[i]);
            if(set.size()==3)
                return nums[i];
        }
        return nums[nums.length-1];
    }
}