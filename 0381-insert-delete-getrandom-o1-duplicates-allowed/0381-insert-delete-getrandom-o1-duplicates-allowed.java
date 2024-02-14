class RandomizedCollection {
    
    private  HashMap<Integer, Integer> map;
    private ArrayList<Integer> list ;
    public RandomizedCollection() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        list.add(val);
        if(!map.containsKey(val)){
            map.put(val,1);
            return true;
        }else{
            map.put(val, map.get(val) + 1);
            return false;
        }
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        else{
            
            int index = list.indexOf(val);
            list.remove(index);
            
            if(map.get(val) == 1) map.remove(val);
            else map.put(val, map.get(val)-1);
            return true;
        }
    }
    
    public int getRandom() {
        
        int rand_int = (int)Math.floor(Math.random()*(list.size()));
         return list.get(rand_int);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */