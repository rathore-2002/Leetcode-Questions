class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int arr[] = new int[nums[nums.length-1]]; 
        int j=0;
        arr[0] = nums[0];
        for(int i=0;i<nums.length-1;i++)
        {  
            if(nums[i+1]>nums[i]+1)
            {
                for(int k = nums[i];k<nums[i+1] - 1;k++)
                {
                    j++;
                    arr[j] = 0; 
                }
            }
            if(nums[i] == nums[i+1])
                arr[j] += nums[i];
            else if(j<arr.length-1){
                j++;
                arr[j] = nums[i+1];
            }
        }
        int sum=0;
        int sum1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2 == 0)
            {
                sum += arr[i];
                sum = Math.max(sum,sum1);
            }
            else
            {
                sum1 += arr[i];
                sum1 = Math.max(sum,sum1);
            }
        }
        if(sum1>sum)
            return sum1;
        else
            return sum;
    }
}