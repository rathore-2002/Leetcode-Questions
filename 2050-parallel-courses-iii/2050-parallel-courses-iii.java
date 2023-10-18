class Solution {
    public int minimumTime(int n, int[][] relations, int[] time){
        int[] result = new int[time.length + 1];
        int var = 1, N = relations.length - 1;
        // copy time to result
        for(int t : time) result[var++] = t;

        for(boolean c = true; c; ){
            c = false;
            for(int[] a : relations){ // from start
                if(result[a[0]] + time[a[1] - 1] > result[a[1]]){
                    c = true;
                    result[a[1]] = result[a[0]] + time[a[1] - 1];
                }
            }
            for(var = N; var > -1; var--){ // from end
                int[] a = relations[var];
                if(result[a[0]] + time[a[1] - 1] > result[a[1]]){
                    c = true;
                    result[a[1]] = result[a[0]] + time[a[1] - 1];
                }
            }
        }

        var = 0;
        for(int r : result) if(var < r) var = r;
        return var;
    }
}