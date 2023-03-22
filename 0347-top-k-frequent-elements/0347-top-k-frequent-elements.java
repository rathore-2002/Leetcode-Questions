class Solution {
    class Pair implements Comparable<Pair>{
        int value;
        int freq;
        public Pair(int value,int freq){
            this.value=value;
            this.freq=freq;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.freq-this.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int ans[] = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Integer i : map.keySet()){
            pq.add(new Pair(i,map.get(i)));
        }
        for(int i=0;i<k;i++){
            ans[i]=pq.remove().value;
        }
        return ans;
    }
}