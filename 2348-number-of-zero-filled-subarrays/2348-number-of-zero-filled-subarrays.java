class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int l=0,e=0,n=nums.length;
        long sum=0,ans=0;
        for(;e<n;e++){
            sum+=nums[e];
            for(;sum!=0;l++){
                sum-=nums[l];
            }
            ans+=(e-l+1);
        }
        return ans;
    }
}


/*class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int s=0;
        int e=0;
        long ans=0;
        int sum=0;
        while(e<nums.length){
            sum+=nums[e];
            while(sum!=0){
                sum-=nums[s];
                s++;
            }
        ans+=e-s+1;
        e++;
        }
        return ans;
    }
}*/