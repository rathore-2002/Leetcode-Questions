class KthLargest {
    int k;
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i : nums)
            pq.add(i);
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size() !=k)
    {
        pq.remove();
    }
    return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */