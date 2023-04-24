class Solution {
    public int lastStoneWeight(int[] stones) {
    
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<stones.length;i++)
            queue.add(stones[i]);
        
        while(queue.size()>1){
            int num1=queue.poll();
        int num2=queue.poll();
        if(num1!=num2)
            queue.add(num1-num2);
    }
        
        if(queue.size()==0)
            return 0;
        else
            return queue.poll();
    }
}
   