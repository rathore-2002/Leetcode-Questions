class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        
        for(int i=0;i<m;i++){              //i=2   i<3
        for(int j=0;j<n;j++){              //j=0    j<3
        if(matrix[i][j]==0){               //matrix[2][0]
         row.add(i);      //row->1
        col.add(j);      //col->1
        }}}
            
            for(int i : row){          //i=1
            for(int j=0;j<n;j++){     //j=3   j<3
            matrix[i][j]=0;          // matrix[1][2]=0
            }}
            
            for(int j : col){            //j=1
            for(int i=0;i<m;i++){        //i=2   i<3
             matrix[i][j]=0;              //matrix[2][1]=0
             }}  
    }
}