class Solution {
    public void setZeroes(int[][] mat) {
        ArrayList<Integer> row = new ArrayList<>();
  ArrayList<Integer> col = new ArrayList<>();
        int m=mat.length;
        int n=mat[0].length;
   for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(mat[i][j]==0){
            row.add(i);
            col.add(j);
        }
      }
   }   

  for(int i : row){
     for(int j=0;j<n;j++){
       mat[i][j]=0;
     }
   }

  for(int i : col){
     for(int j=0;j<m;j++){
       mat[j][i]=0;
     }
  }
    }
}