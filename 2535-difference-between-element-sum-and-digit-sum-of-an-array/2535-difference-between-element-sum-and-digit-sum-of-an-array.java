class Solution {
    public int differenceOfSum(int[] nums) {
        int x=0,y=0;
        for(int i : nums){
            x+=i;
            if(i<=9)  
                y+=i;
            else{
            while(i>0){
                y+=i%10;
                i/=10;
            }
            }
        }
        return Math.abs(x-y);
    }
}