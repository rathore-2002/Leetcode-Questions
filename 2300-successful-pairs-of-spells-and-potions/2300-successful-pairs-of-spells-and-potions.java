class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int ans[] = new int[spells.length];
        for(int i=0;i<spells.length;i++){
            ans[i]=couSuc(spells[i],potions,success);
        }
        return ans;
    }
    private int couSuc(int a, int[] arr, long b){
        int start=0,end=arr.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if((long)arr[mid]*a>=b){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return arr.length-start;
    }
}