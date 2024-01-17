class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length == 0){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }
        Set<Integer> set = new HashSet<>(map.values());
        if(map.size() == set.size()) {
            return true;
        }
        return false;
        
    }
}