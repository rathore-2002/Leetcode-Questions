class Solution {
    public double average(int[] salary) {
        int n=salary.length;
       int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        double sum=0;
        for(int i : salary){
            max=Math.max(max,i);
            min=Math.min(min,i);
            sum+=i;
        }
        sum=sum-(max+min);
        return sum/(n-2);
    }
}