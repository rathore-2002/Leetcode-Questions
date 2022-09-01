class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int flag=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        int ctr=0;
       for(Character i : map.keySet()){
           if(map.get(i)%2==0)
               ctr+=map.get(i);
           else if(map.get(i)%2!=0 && map.get(i)>1){
               ctr+=map.get(i)-1;
               flag=1;
           }
           else flag=1;
       }
        if(flag==1)
            return ctr+1;
        else
            return ctr;
    }
}