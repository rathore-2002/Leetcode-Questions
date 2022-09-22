class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m=matrix.length;
        int n=matrix[0].length;
        int row=0;
        for(int i=0;i<m;i++){
            if(target<matrix[i][n-1]){
                row=i;
                break;
            }
            else if(target==matrix[i][n-1])
                return true;
                
        }
        
        int s=0;
        int e=n-1;
        while(s<e){
            int mid=(s+e)/2;
            if(target==matrix[row][mid])
                return true;
            else if(target<matrix[row][mid])
                e--;
            else s++;
        }
        return false;
    }
}