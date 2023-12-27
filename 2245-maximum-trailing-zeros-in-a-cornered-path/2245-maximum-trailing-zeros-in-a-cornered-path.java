class Solution {
    public int maxTrailingZeros(int[][] grid) {
        int[][][] t = new int[grid.length][grid[0].length][8];
        int n = grid.length;
        int m = grid[0].length;

        int[][][] tf = new int[n][m][2];
        for(int i = 0; i<n;i++) {
            for(int j = 0 ; j<m ;j++) {
                int two = 0;
                int five = 0;
                int k = grid[i][j];
                while(k%2==0){
                    k/=2;
                    two++;
                }
                while(k%5==0){
                    k/=5;
                    five++;
                }
                tf[i][j][0] = two;
                tf[i][j][1] = five;
            }
        }
        for(int i = 0; i<n;i++) {
            int two = 0;
            int five = 0;
            for(int j = 0; j<m;j++) {
                int k = grid[i][j];
                while(k%2 == 0) {
                    two++;
                    k=k/2;
                }
                while(k%5 == 0) {
                    five++;
                    k=k/5;
                }
                t[i][j][0] = two;
                t[i][j][1] = five;
            }
        }


        for(int i = 0; i<n;i++) {
            int two = 0;
            int five = 0;
            for(int j = m-1; j>=0;j--) {
                int k = grid[i][j];
                while(k%2 == 0) {
                    two++;
                    k=k/2;
                }
                while(k%5 == 0) {
                    five++;
                    k=k/5;
                }
                t[i][j][2] = two;
                t[i][j][3] = five;
            }
        }
         for(int i = 0; i<m;i++) {
            int two = 0;
            int five = 0;
            for(int j = 0; j<n;j++) {
                int k = grid[j][i];
                while(k%2 == 0) {
                    two++;
                    k=k/2;
                }
                while(k%5 == 0) {
                    five++;
                    k=k/5;
                }
                t[j][i][4] = two;
                t[j][i][5] = five;
            }
        }
        for(int i = 0; i<m;i++) {
            int two = 0;
            int five = 0;
            for(int j = n-1; j>=0;j--) {
                int k = grid[j][i];
                while(k%2 == 0) {
                    two++;
                    k=k/2;
                }
                while(k%5 == 0) {
                    five++;
                    k=k/5;
                }
                t[j][i][6] = two;
                t[j][i][7] = five;
            }
        }
        int[][] ans = new int[n][m];
        int a = 0;
         for(int i = 0; i<n; i++) {
            for(int j = 0; j<m ;j++) {
                ans[i][j] = Math.max(ans[i][j],Math.min(t[i][j][0] + t[i][j][4] - tf[i][j][0],t[i][j][1] + t[i][j][5] - tf[i][j][1])); //3
                ans[i][j] = Math.max(ans[i][j],Math.min(t[i][j][0] + t[i][j][6]- tf[i][j][0],t[i][j][1] + t[i][j][7]- tf[i][j][1]));
                ans[i][j] = Math.max(ans[i][j],Math.min(t[i][j][2] + t[i][j][4]- tf[i][j][0],t[i][j][3] + t[i][j][5]- tf[i][j][1]));
                ans[i][j] = Math.max(ans[i][j],Math.min(t[i][j][2] + t[i][j][6]- tf[i][j][0],t[i][j][3] + t[i][j][7]- tf[i][j][1]));
            a = Math.max(a,ans[i][j]);
            }
         }
         return a;
        
    }
}