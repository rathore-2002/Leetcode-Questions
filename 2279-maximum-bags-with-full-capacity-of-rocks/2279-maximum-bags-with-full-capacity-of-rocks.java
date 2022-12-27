class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
         for(int i = 0; i < rocks.length; ++i){
             if(capacity[i] <= rocks[i]){
                 ++count;
             }
             else{
                 list.add(capacity[i] - rocks[i]);
             }
         }
         int len = list.size();
         int[] arr = new int[len];
         for(int i = 0; i < len; ++i){
             arr[i] = list.get(i);
         }
         Arrays.sort(arr);
         int i = 0;
         
         while(additionalRocks > 0 && i < len){
             if(additionalRocks >= arr[i]){
                 ++count;
                 additionalRocks -= arr[i];
                 ++i;
             }
             else{
                 break;
             }
         }
         return count;
    }
}