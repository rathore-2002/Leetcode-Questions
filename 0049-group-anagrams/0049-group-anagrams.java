class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] temp=s.toCharArray();
            Arrays.sort(temp);
            String newstr=new String(temp);
         
            if(!map.containsKey(newstr)){
                ArrayList<String> ans = new ArrayList<>();
                ans.add(s);
                map.put(newstr,ans);
            }
            else{
                map.get(newstr).add(s);
            }
        }
       return new ArrayList(map.values());
    }
}





