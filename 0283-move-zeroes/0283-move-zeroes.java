class Solution {
    public void moveZeroes(int[] nums) {
     int k = 0;
    while (k < nums.length) {
      if (nums[k] == 0) {

        break;
      } else {
        k = k + 1;
      }
    }
        int i=k,j=i+1;
        while(i<nums.length && j<nums.length){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
        
    }
}