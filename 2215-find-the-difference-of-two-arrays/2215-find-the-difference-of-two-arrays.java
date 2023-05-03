class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i : nums1)         set1.add(i);
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums2)         set2.add(i);
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
       for(int i : set1){
           if(!set2.contains(i))       ans1.add(i);
       }
        res.add(ans1);
        for(int i : set2){
           if(!set1.contains(i))       ans2.add(i);
       }
        res.add(ans2);
        return res;
    }
}