class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
           map.put(i, map.getOrDefault(i, 0) + 1);
        }
            
        while(!map.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
           for(Integer i : map.keySet()){
                   ans.add(i);
                   map.put(i,map.get(i)-1);
                   if(map.get(i)==0)       b.add(i);
           }
            res.add(ans);
            for(int i : b)             map.remove(i);
        }
        return res;
    }
}



