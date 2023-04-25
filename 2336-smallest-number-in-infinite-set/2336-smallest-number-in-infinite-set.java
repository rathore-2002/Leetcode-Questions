class SmallestInfiniteSet {
    int SMALLEST;
    PriorityQueue<Integer> minHeap;
    public SmallestInfiniteSet() {
        SMALLEST = 1;
        minHeap = new PriorityQueue<>();
    }
    
    public int popSmallest() {
        if(minHeap.isEmpty()){
            return SMALLEST++;
        }
        return minHeap.poll();
    }
    
    public void addBack(int num) {
        if(num >= SMALLEST || minHeap.contains(num)) {
            return;
        }
        minHeap.add(num);
    }
}


/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */