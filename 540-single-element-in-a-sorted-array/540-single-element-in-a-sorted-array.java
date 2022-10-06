class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
            map.put(i,map.getOrDefault(i,0)+1);
        for(Integer i : map.keySet()){
            if(map.get(i)==1)
                return i;
        }
        return -1;
    }
}