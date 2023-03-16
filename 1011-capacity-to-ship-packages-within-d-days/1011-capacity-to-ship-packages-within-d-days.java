class Solution {
   public int shipWithinDays(int[] weights, int days) {

        int capacity = 0;
        int start = Arrays.stream(weights).max().getAsInt();
        int end = Arrays.stream(weights).sum();

        while(start<=end){
            int mid = start + (end-start)/2;
            if( isPossible(weights, mid,days)){
                capacity = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return capacity;

    }

    private boolean isPossible(int[] weights, int mid, int days) {
        int currentDay = 1;
        long currentWeight=0;
        for(int weight:weights){

            currentWeight+=weight;
            if(currentWeight>mid){
                currentDay++;
                currentWeight=weight;
            }

        }
        return currentDay<=days;

    }
}