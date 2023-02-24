class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[256];
        for(char ch : s.toCharArray()){
            count[ch]++;
        }

        boolean one = false;
        int len = 0;
        for(int ele : count){
            if(ele%2 == 0)
               len += ele;
            else{
                len += ele-1;
                one = true;
            }
        }
        return one ? len + 1 : len;
    }
}