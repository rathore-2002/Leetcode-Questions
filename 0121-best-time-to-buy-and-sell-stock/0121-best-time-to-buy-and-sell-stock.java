class Solution {
    public int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        int cp=prices[0];
        for(int i : prices){
            cp=Math.min(cp,i);
            profit=Math.max(profit,i-cp);
        }
        return profit;
    }
}