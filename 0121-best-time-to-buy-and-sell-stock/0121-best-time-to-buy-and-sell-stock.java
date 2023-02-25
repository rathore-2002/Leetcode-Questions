class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice=Integer.MIN_VALUE;
        int minVal=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minVal=Math.min(minVal,prices[i]);
            maxPrice=Math.max(maxPrice,prices[i]-minVal);
        }
        return maxPrice;
    }
}