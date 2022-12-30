class Solution {
    public int reverse(int x) {
        long n=0;
        while(x!=0){
        int d=x%10;
        n=n*10+d;
        x=x/10;
        }
    if(n<Integer.MIN_VALUE || n>Integer.MAX_VALUE)
        return 0;
    else
        return (int)n;
}
}