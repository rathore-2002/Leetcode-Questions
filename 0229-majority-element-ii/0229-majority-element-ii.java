class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1,num2=-1,c1=0,c2=0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : nums){
            if(i==num1)      c1++;
            else if(i==num2)    c2++;
            else if(c1==0){
                num1=i;
                c1=1;
            }
            else if(c2==0){
                num2=i;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        int ctr1=0,ctr2=0;
        for(int i : nums){
            if(i==num1)    ctr1++;
            if(i==num2)    ctr2++;
        }
        if(ctr1>nums.length/3)       ans.add(num1);
        if(ctr2>nums.length/3 && num1!=num2)       ans.add(num2);
        
        return ans;
    }
}