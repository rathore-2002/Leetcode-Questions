class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int count=1;
        int sum=0;
        for(int i=cost.length-1;i>=0;i--)
        {
            if(count%3==0)
            {
                sum+=0;
            }
            else
            {
                sum+=cost[i];
            }
            count++;
        }
        return sum;
    }
}