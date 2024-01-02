class Solution {
    public boolean isPossible(int[] nums) {
        int[] count = new int[2003];
        int[] end = new int[2003];
        for (int n : nums){
            count[n+1000]++;
        }
        for (int i = 0; i <= 2002; i++){
            if (count[i] < 0){ 
                return false;
            }else if (i <= 2000){
                int cont = Math.min(count[i], i==0?0:end[i-1]); 
                count[i] -= cont;
                end[i] += cont;
                count[i+1] -= count[i]; 
                count[i+2] -= count[i];
                end[i+2] += count[i];  
            }
        }
        return true;
    }
}