class Solution {
    public boolean checkStraightLine(int[][] c) {
        int n=c.length;
        if(n==1 || n==2)   return true;
        int x1=c[1][0]-c[0][0];
        int y1=c[1][1]-c[0][1];
        for(int i=1; i<c.length; i++){
            int x = c[i][0] - c[i-1][0];
            int y = c[i][1] - c[i-1][1];
            if(y * x1 != x * y1)
                return false;
        }
        return true;
    }
}