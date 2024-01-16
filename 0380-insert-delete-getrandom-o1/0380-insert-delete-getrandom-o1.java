class RandomizedSet {
    private List<Integer> nums;
    private Map<Integer, Integer> indexMap;
    private Random rand;
    public RandomizedSet() {
        nums = new ArrayList<>();
        indexMap = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (indexMap.containsKey(val)) {
            return false;
        }

        nums.add(val);
        indexMap.put(val, nums.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }

        int lastElement = nums.get(nums.size() - 1);
        int valIndex = indexMap.get(val);

        nums.set(valIndex, lastElement);
        indexMap.put(lastElement, valIndex);

        nums.remove(nums.size() - 1);
        indexMap.remove(val);

        return true;
    }
    
    public int getRandom() {
        int randomIndex = rand.nextInt(nums.size());
        return nums.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */