class Solution {
    public long getDescentPeriods(int[] prices) {
        int l=0,e=1,n=prices.length;
        long ans=1;
        for(;e<n;e++){
            if(prices[e-1]-prices[e]==1){
                int count=e-l+1;
                ans+=count;
            }
            else{
                l=e;
                ans+=1;
            }
        }
        return ans;
    }
}