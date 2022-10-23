class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        int a=0,b=0;
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i))
                b=i;
            else if(map.get(i)>1)
                a=i;
        }
        return new int[]{a,b};
    }
}