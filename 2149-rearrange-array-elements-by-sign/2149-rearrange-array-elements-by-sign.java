class Solution {
    public int[] rearrangeArray(int[] nums) {
        int even[]=new int[nums.length/2];
        int odd[]=new int[nums.length/2];
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                even[k++]=nums[i];
            else
                odd[j++]=nums[i];
        }
        int p=0;
        for(int i=0;i<even.length;i++){
            nums[p]=even[i];
            p+=2;
        }
        int q=1;
        for(int i=0;i<odd.length;i++){
            nums[q]=odd[i];
            q+=2;
        }
        
        return nums;
    }
}