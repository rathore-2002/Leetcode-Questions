class Solution {
    public int[][] imageSmoother(int[][] a) {
        int n = a.length, m = a[0].length;
        int[][] ans = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[i][j] = findAverage(i, j, n, m, a);
            }
        }
        return ans;
    }

    private int findAverage(int i, int j, int n, int m, int[][] a){
        // current cell
        int total = 1, touchingCells = a[i][j];
        // adjacent cells
        if(j-1 >= 0){
            touchingCells += a[i][j-1];
            total++;
        }
        if(j+1 < m){
            touchingCells += a[i][j+1];
            total++;
        }
        if(i-1 >= 0){
            touchingCells += a[i-1][j];
            total++;
        }
        if(i+1 < n){
            touchingCells += a[i+1][j];
            total++;
        }
        // diagonal cells
        if(i-1 >= 0 && j-1 >= 0){
            touchingCells += a[i-1][j-1];
            total++;
        }
        if(i+1 < n && j-1 >= 0){
            touchingCells += a[i+1][j-1];
            total++;
        }
        if(i-1 >= 0 && j+1 < m){
            touchingCells += a[i-1][j+1];
            total++;
        }
        if(i+1 < n && j+1 < m){
            touchingCells += a[i+1][j+1];
            total++;
        }
        return touchingCells / total;
    }
}