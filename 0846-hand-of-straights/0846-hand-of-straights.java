class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        if(hand.length % W !=0) return false;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : hand)
            pq.add(i);
        while(!pq.isEmpty()){
            int start = pq.poll();
            for(int i=1;i<W;i++){
                if(!pq.remove(start+i))      return false;
            }
        }
        return true;
    }
}


