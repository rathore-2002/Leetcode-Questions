class Solution {
    public int maxinRow(int[] row,int end){
        int max=0;
        for(int i=0;i<=end;i++){
            if(row[i]>row[max])    max=i;
        }
        return max;
    }
    public int[] findPeakGrid(int[][] mat) {
        int s=0,e=mat.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int res=maxinRow(mat[mid],mat[mid].length-1);
            if(mid==0){
                if(mat[mid][res]>mat[mid+1][res])     return new int[]{mid,res};
            }
            if(mid==mat.length-1){
                if(mat[mid][res]>mat[mid-1][res])     return new int[]{mid,res};
            }
             if(mat[mid][res]>mat[mid+1][res] && mat[mid][res]>mat[mid-1][res])  
                 return new int[]{mid,res};
            
            if (mat[mid][res] < mat[mid+ 1][res]) {
	            s= mid+1;
	        } else {                             
	            e= mid-1;
	        }
               
        }
        return new int[]{-1,-1};
    }
}