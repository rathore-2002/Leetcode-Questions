class NumArray {
    int ans[];
    public NumArray(int[] nums) {
        ans=nums;
        for(int i=1;i<nums.length;i++)
            ans[i]+=ans[i-1];
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
            return ans[right];
        else
            return ans[right]-ans[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

