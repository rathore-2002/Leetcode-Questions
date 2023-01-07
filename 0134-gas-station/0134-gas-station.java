class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;

        //total surplus during the whole journey
        int total  = 0;
        
        // our tank        
        int gasAvailable = 0;

        int index = 0;
        
        for(int i = 0; i < n; i++){
            total  += gas[i] - cost[i];
            gasAvailable += gas[i] - cost[i];
            
            // if the tank goes -ve
            if(gasAvailable < 0){
                gasAvailable = 0;
                index = i + 1;
            }
        }
        
        return (total  < 0) ? -1 : index;
    }
}