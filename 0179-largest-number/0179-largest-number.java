class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for(int i=0;i<nums.length;i++){
           s[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        String ans = "";
        for(String i : s)      ans+=i;
        return ans.startsWith("0")?"0" : ans;
    }
}