class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : candyType)
            map.put(i,map.getOrDefault(i,0)+1);
        return Math.min(map.size(),candyType.length/2);
    }
}