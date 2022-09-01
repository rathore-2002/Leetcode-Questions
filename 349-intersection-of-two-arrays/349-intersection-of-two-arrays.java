class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int i : nums1){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        
        for(int i : nums2){
            if(map.containsKey(i)){
                ans.add(i);
            }
        }
        int a[]=new int[ans.size()];
        int k=0;
        for(Integer i : ans)
            a[k++]=i;
        return a;
    }
}