class Solution {
    public int nthUglyNumber(int n) {
        int ans[] = new int[n];
        ans[0]=1;
        int i2=0,i3=0,i5=0;
        int f2=2,f3=3,f5=5;
        for(int i=1;i<n;i++){
            ans[i]=Math.min(Math.min(f2,f3),f5);
            if(f2==ans[i])      f2=2*ans[++i2];
            if(f3==ans[i])      f3=3*ans[++i3];
            if(f5==ans[i])      f5=5*ans[++i5];
        }
        return ans[n-1];
    }
}