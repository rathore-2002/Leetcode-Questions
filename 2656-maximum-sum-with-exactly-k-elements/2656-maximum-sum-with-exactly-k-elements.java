class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int x:nums){
            max=Math.max(max,x);
        }
        int sum=max;
        int n=sum;
        for(int i=1;i<k;i++){
            sum+=(n+i);
        }
        return sum;
    }
}