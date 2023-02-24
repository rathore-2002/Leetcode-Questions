class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        int flag=0,count=0;
        for(Character i : map.keySet()){
            if(map.get(i)>1){
                if(map.get(i)%2!=0 && flag==0) {
                    flag=1;
                    count++;
                }
                count+=2*(map.get(i)/2);
            }
            else if(flag==0 && map.get(i)==1) {
                count++;
                flag=1;
            }
        }
        return count;
    }
}