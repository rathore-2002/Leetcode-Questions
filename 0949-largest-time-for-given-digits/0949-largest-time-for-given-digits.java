class Solution {
    public String largestTimeFromDigits(int[] arr) {
        PriorityQueue<Integer>[] maxVals = new PriorityQueue[5];

        for(int i = 0; i < 5; i++) {
            maxVals[i] = new PriorityQueue<>(Collections.reverseOrder());
        }

        for(int num : arr) {
            if(num <= 1) maxVals[0].offer(num);
            else if(num <= 2) maxVals[1].offer(num);
            else if(num <= 3) maxVals[2].offer(num);
            else if(num <= 5) maxVals[3].offer(num);
            else maxVals[4].offer(num);
        }

        int h1 = -1;
        int h2 = -1;
        int m1 = -1;
        int m2 = -1;

        if (maxVals[4].size() > 2) return "";
        if (maxVals[4].size() == 2) {
            h2 = maxVals[4].poll();
            m2 = maxVals[4].poll();
            
            h1 = cascadePoll(maxVals, 0);
            m1 = cascadePoll(maxVals, 3);
        } 
        else {
            h1 = cascadePoll(maxVals, 1);
            h2 = cascadePoll(maxVals, h1 == 2 ? 2 : 4);

            m1 = cascadePoll(maxVals, 3);
            m2 = cascadePoll(maxVals, 4);
        }

        if(h1 == -1 || h2 == -1 || m1 == -1 || m2 == -1) return "";

        return new StringBuilder().append(h1).append(h2).append(":").append(m1).append(m2).toString();
    }

    public int cascadePoll(PriorityQueue<Integer>[] maxVals, int startHeap) {
        for(int i = startHeap; i >= 0; i--) {
            PriorityQueue<Integer> maxHeap = maxVals[i];
            if(!maxHeap.isEmpty()) return maxHeap.poll();
        }
        return -1;
    }
}