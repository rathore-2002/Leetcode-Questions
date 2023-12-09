class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,ans=0,n=s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(;r<n;r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            for(;map.get(s.charAt(r))>1;l++){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}