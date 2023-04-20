class Solution {
    public double myPow(double x, int n) {
        if (n == 1){
            return x;
        } else if (n == -1){
            return 1/x;
        } else if (n == 0){
            return 1;
        }
        
        if (n%2 == 0){
            double result = myPow(x, n/2);
            
            return result*result;
        } else {
            double result = myPow(x, n/2);
            
            if (n > 0){
                return x*result*result;
            }
            return (result*result)/x;
        }
    }
}