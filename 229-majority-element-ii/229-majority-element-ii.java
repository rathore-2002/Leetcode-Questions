class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : nums){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        int k=nums.length/3;
        for(Integer i : map.keySet()){
            if(map.get(i)>k)
                ans.add(i);
        }
        return ans;
    }
}