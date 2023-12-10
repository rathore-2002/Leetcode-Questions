class Solution {
   public int captureForts(int[] f) {
        int r=0,j=0;
        for(int i=0;i<f.length;i++){
            if(f[i]!=0){
                if(f[j]==-f[i]) r=Math.max(r,i-j-1);
                j=i;
            }
        }return r;
    }
}