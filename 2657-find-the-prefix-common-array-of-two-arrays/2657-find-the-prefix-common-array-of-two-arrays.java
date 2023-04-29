class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq = new int[51];
        int[] C = new int[A.length];
        for(int i=0;i<A.length;i++){
            freq[A[i]]++;
            freq[B[i]]++;
            int c=0;
            
            for(int x:freq){
                if(x==2){
                    c++;
                }
            }
            C[i] = c;
        }
        return C;
    }
}