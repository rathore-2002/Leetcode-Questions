class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int s=0;
        int e=(m*n)-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return false;
    }
}