class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean[] multiples=new boolean[n];
        for(int i=2;i<=Math.sqrt(n);i++){
            if(multiples[i]==false){
                for(int j=i*i;j<n;j+=i){
                    multiples[j]=true;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(multiples[i]==false) count++;
        }
        return count;
    }
}