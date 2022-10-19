class Solution {
    public List<String> topKFrequent(String[] words, int k) {
         List<String> res = new ArrayList<>();
    Map<String,Integer> map = new TreeMap<>();
    
    for(String str : words)
        map.put(str,map.getOrDefault(str,0)+1);
    
    int max=0;
    for(int val : map.values())
        max = Math.max(val,max);
    
    
    while(true){
        for(String str : map.keySet()){   
            if(k==res.size()) return res;
            if(map.get(str)==max)
                res.add(str);
        }
        max--;
    }
    

    }
}