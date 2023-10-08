class Solution {
    public int integerBreak(int n) {
        if (n < 3) return 1;
        if (n == 2 || n == 3) return 2;
        
        int remainder = n % 3;
        int quotient = n / 3;
        if (remainder == 1) {
            quotient--;
            remainder = 4;
        }
        
        int result = (int) Math.pow(3, quotient);

        if (remainder != 0) {
            result *= remainder;
        }
        
        return result;
    }    
}