class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int start=0;
        int curr=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>=start){
                start=map.get(ch)+1;
                max=Math.max(max,curr);
                curr=i-map.get(ch);
            }
            else
                curr++;
            
        map.put(ch,i);
            
            
        }
        max=Math.max(max,curr);
        return max;
    }
}