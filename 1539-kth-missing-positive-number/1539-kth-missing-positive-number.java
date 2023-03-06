class Solution {
    public int findKthPositive(int[] arr, int k) {
       HashSet<Integer> set = new HashSet<>();
        for(int i : arr)
            set.add(i);
        int i=1,ctr=0;
        while(ctr<k){
            if(!set.contains(i))
                ctr++;
            i++;
        }
        return i-1;
    }
}