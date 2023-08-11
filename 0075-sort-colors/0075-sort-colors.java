class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;
        while(m<=h){
            switch(nums[m]){
                case 0:
                    int temp=nums[l];
                    nums[l]=nums[m];
                    nums[m]=temp;
                    l++;
                    m++;
                    break;
                    
                case 1:
                    m++;
                    break;
            
                case 2:
                     temp=nums[m];
                    nums[m]=nums[h];
                    nums[h]=temp;
                    h--;
                    break;
            }
        }
    }
}