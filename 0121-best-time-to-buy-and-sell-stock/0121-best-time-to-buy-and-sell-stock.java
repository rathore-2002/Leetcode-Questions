class Solution {
    public int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        int sp=prices[0];
        for(int i : prices){
            sp=Math.min(sp,i);
            profit=Math.max(profit,i-sp);
        }
        return profit;
    }
}