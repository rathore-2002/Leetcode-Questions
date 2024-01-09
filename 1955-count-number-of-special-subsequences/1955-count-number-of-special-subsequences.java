class Solution {
    public int countSpecialSubsequences(int[] nums) {
        long a = 0;
        long ab = 0;
        long abc = 0;
        for(int i=0;i<nums.length;i++){
            int c = nums[i];
            if(c==0) a = (2*a + 1)%1000000007;
            else if(c==1) ab = (2*ab + a)%1000000007;
            else if(c==2)abc = (2*abc + ab)%1000000007;
        }
        return (int)(abc%1000000007);
    }
}