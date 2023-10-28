class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr = new ArrayList<>();
        int l=0,e=p.length(),n=s.length(),ans=0;
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> pMap = new HashMap<>();
        if (p.length() > s.length()) {  
            return arr;
        }
        for(int i=0;i<p.length();i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
            pMap.put(p.charAt(i),pMap.getOrDefault(p.charAt(i),0)+1);
        }
        if(sMap.equals(pMap))              arr.add(0);
        
        for(;e<n;e++){
           char add = s.charAt(e);   
            sMap.put(add, sMap.getOrDefault(add, 0) + 1);
            char del = s.charAt(l++);   
            sMap.put(del, sMap.get(del) - 1);
            if (sMap.get(del) == 0) {   
                sMap.remove(del);
            }
             if (sMap.equals(pMap)) {
                arr.add(l);  
              }
        }

        return arr;
    }
}