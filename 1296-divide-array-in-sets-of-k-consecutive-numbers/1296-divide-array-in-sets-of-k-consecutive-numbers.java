class Solution {
    public boolean isPossibleDivide(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }
        
        int totalgroup = hand.length / groupSize;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i < hand.length; i++){
            pq.add(hand[i]);
        }
        
        while(!pq.isEmpty()){
            int start = pq.poll();
            start++;
            
            int j = 0;
            while(j++ < groupSize - 1){
                if(pq.contains(start)){
                    pq.remove(start++);
                }
                else{
                    return false;
                }
            }
        }
                
        return true;
    }
}