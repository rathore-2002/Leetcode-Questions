class Solution {
    public int countHomogenous(String s) {
        int sum=0;
        int i=0;
        int mod=1000000007;
        int n=s.length();
        while(i<n){
            char ch1=s.charAt(i);
            int j=i+1;
            int cnt=1;
            while(j<n&&s.charAt(j)==ch1){
                j++;
                cnt++;
            }
           int res =(int)(((long)(cnt)*(cnt+1)/2)%mod);
            sum=(sum+res)%mod;
            i=j;
        }
        return sum;
    }
}