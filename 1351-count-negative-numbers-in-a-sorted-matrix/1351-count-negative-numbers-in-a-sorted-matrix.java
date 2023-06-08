class Solution {
    public int countNegatives(int[][] grid) {
       int count = 0;
        
        for(int i = 0; i < grid.length; i++){
            
            int[] row = grid[i];
            
            if(row[0] < 0) {
                count += row.length;
                continue;
            }
            
            int start = 0;
            int end = row.length - 1;
            
            if(row[end] >= 0) continue;
            
            while(start <= end){
                
                int mid = start + (end - start)/2;
                
                if(row[mid] < 0){
                    count += end - mid + 1;
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
                    
            }
        }
        
        return count;
    }
}