class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        char ch[] = order.toCharArray();
        
       for(int i=0;i<ch.length;i++)
           map.put(ch[i],i);
        
        for(int i=0;i<words.length-1;i++){
            int len1=words[i].length();
            int len2=words[i+1].length();
            
           // if(len1>len2)  return false;
            
            for(int j=0;j<len1 && j<len2;j++){
                
                if(words[i].charAt(j)!=words[i+1].charAt(j)){
                    if(map.get(words[i].charAt(j))>map.get(words[i+1].charAt(j)))
                        return false;
                    if(i==words.length-2)
                    return true;
                }
            }
            if(len1>len2)
            return false;
        }
        return true;
    }
}