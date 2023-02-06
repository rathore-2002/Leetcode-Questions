class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int i=0,j=n,k=0;
        while(i<j && j<nums.length){
            ans[k++]=nums[i++];
            ans[k++]=nums[j++];
        }
        return ans;
    }
}