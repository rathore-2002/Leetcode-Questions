class Solution {
    public int mySqrt(int x) {
        long s=1;
        long e=x;
        while(s<=e){
            long m=s+(e-s)/2;
            if(m*m==x)
                return (int)m;
            else if(m*m<x)
                s=m+1;
            else e=m-1;
        }
        return (int)s-1;
    }
}