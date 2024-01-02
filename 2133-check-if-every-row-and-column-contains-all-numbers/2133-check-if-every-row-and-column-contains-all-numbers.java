class Solution {
    public boolean checkValid(int[][] m) {
        Set< String > set = new HashSet<>();
        for ( int i = 0; i < m.length; i++ )
            for ( int j = 0; j < m.length; j++ )
                if (!set.add(m[i][j]+"r"+i) || !set.add(m[i][j] +"c"+j)) return false;
        return true;
    }
}