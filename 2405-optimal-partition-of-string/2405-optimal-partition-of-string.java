class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
            int i=0,ctr=0;
            while(i<s.length()){
                ctr++;
            while((i<s.length()) && !set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                i++;
            }
           set.clear();
        }
        return ctr;
    }
}