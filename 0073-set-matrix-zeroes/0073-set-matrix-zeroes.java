class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int j : row){
            for(int i=0;i<n;i++)            matrix[j][i]=0;
        }
        for(int j : col){
            for(int i=0;i<m;i++)            matrix[i][j]=0;
        }
    }
}