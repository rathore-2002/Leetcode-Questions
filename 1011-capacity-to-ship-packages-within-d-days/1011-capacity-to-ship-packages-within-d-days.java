class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int i=0, j=0;
        for(int x:weights){
            i=Math.max(i,x);
            j+=x;
        }
        while(i<=j){
            int mid = (i+j)/2;
            int currdays = 1;
            int sum=0;
            for(int x:weights){
                sum+=x;
                if(sum>mid){
                    sum=x;
                    currdays++;
                }
            }

            if(currdays>days){
                i=mid+1;  
            }
            else{
                j=mid-1;  
            }
        }
        return i;
    }
}