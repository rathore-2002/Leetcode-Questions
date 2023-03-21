class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        long length = 0;
        for(int num : nums){
            if(num == 0){
                res += ++length;
            } else {
                length = 0;
            }
        }
        return res;
    }
}