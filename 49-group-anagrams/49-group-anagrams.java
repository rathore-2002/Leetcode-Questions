class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char temp[] = strs[i].toCharArray();
            Arrays.sort(temp);
            String newstr = new String(temp);
            
            if(!map.containsKey(newstr)){
                ArrayList<String> grp = new ArrayList<>();
                grp.add(strs[i]);
                map.put(newstr,grp);
            }
            else
                map.get(newstr).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}