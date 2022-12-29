class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[][] tasksWithIndex = new int[n][3];

        for(int i = 0; i < n; i++){
            tasksWithIndex[i][0] = tasks[i][0]; // enqueueTime
            tasksWithIndex[i][1] = tasks[i][1]; // processingTime
            tasksWithIndex[i][2] = i; // index
        }

        //sort the array based on enqueue time
        Arrays.sort(tasksWithIndex, (a,b) -> a[0]-b[0]);   

        int[] response = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[1] == b[1])? a[2]-b[2] : a[1]-b[1]);
        int currentTime = 0;
        int tIndex = 0; //time Index
        int rIndex = 0; //response Index

        while(rIndex < n){
            while(tIndex < n && tasksWithIndex[tIndex][0] <= currentTime){
                pq.add(tasksWithIndex[tIndex++]);
            }
            if(pq.isEmpty()){
                currentTime = tasksWithIndex[tIndex][0];
                continue;
            }

            int[] bestFit = pq.poll(); //processing task
            response[rIndex++] = bestFit[2];
            currentTime += bestFit[1];
        }
        return response;
    }
}