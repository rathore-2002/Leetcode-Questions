class Solution {
    public int arraySign(int[] nums) {
        int zeroCount=0,negativeCount=0;
        for(int i : nums){
            if(i==0){
                zeroCount++;
                break;
            }
            else if(i<0)    negativeCount++;
        }
        if(zeroCount>0)       return 0;
        else if(negativeCount%2==1)       return -1;
        else return 1;
    }
}