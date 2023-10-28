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
           char acquire = s.charAt(e);   
            sMap.put(acquire, sMap.getOrDefault(acquire, 0) + 1);
            char discard = s.charAt(l++);   
            sMap.put(discard, sMap.get(discard) - 1);
            if (sMap.get(discard) == 0) {   
                sMap.remove(discard);
            }
             if (sMap.equals(pMap)) {
                arr.add(l);  
              }
        }

        return arr;
    }
}