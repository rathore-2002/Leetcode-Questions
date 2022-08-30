class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int a[]=new int[2];
        for(int i : nums){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        int k=0;
        for(Integer i :map.keySet()){
            if(map.get(i)==1)
                a[k++]=i;
        }
        return a;
    }
}