class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int rowno=0;
        int colno=0;
        while(rowno<m && colno<n){
            for(int i=colno;i<n;i++)
                arr.add(matrix[rowno][i]);
            rowno++;
            for(int i=rowno;i<m;i++)
                arr.add(matrix[i][n-1]);
            n--;
            if(rowno<m){
            for(int i=n-1;i>=colno;i--)
                arr.add(matrix[m-1][i]);
            m--;
            }
            if(colno<n){
                for(int i=m-1;i>=rowno;i--)
                    arr.add(matrix[i][colno]);
                    colno++;
            }
        }
        return arr;
    }
}