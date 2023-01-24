class Solution {
    public int minBitFlips(int start, int goal) {
        int n=(start ^ goal);
        
        int ctr=0;
        while(n!=0){
            if((n & 1)==1)
                ctr++;
            n=n>>1;
        }
        return ctr;
    }
}