class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> a= new ArrayList<Integer>();
        int i=nums.length-1, carry=0, sum=0;
        while(i>=0||k>0)
        {
            if(i>=0)
               sum=carry+nums[i]+k%10;
            else
               sum=carry+k%10;
            k=k/10;
            carry=sum/10;
            a.add(sum%10);
            i--;
        }
        if(carry>0)
            a.add(carry);
        Collections.reverse(a);
        return a;
    }
}