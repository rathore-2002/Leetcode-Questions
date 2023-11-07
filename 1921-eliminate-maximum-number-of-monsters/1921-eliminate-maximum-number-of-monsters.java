class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        if (dist.length == 0 || speed.length == 0) {
            return 0;
        }

        double[] time = new double[dist.length];
        for (int i = 0; i < dist.length; i++) {
            time[i] = (double) dist[i] / speed[i];
        }

        Arrays.sort(time);

        int count = 0;
        for (int i = 0; i < time.length; i++) {
            if (time[i] <= i) {
                break;
            }
            count++;
        }

        return count;
    }
}