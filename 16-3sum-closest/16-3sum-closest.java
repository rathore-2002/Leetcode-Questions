class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0,diff=0,sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                diff=Math.abs(sum-target);
                if(diff<min){
                    min=diff;
                    res=sum;
                }
                if(sum<=target)
                    j++;
                else
                    k--;
            }
           
        }
        return res;
    }
}