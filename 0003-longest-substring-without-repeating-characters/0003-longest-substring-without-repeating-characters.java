class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,e=0,n=s.length(),ans=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(;e<n;e++){
            map.put(s.charAt(e),map.getOrDefault(s.charAt(e),0)+1);
            for(;map.get(s.charAt(e))>1;l++){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
            }
            ans=Math.max(ans,e-l+1);
        }
        return ans;
    }
}