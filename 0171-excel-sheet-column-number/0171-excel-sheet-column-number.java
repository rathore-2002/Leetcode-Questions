class Solution {
    public int titleToNumber(String columnTitle) {
        char s[]=columnTitle.toCharArray();
       int result = 0;
        for(int i=0;i<columnTitle.length();i++){
          int d = (int)(s[i]- 'A' + 1);
          result = result* 26 + d;
        }
        return result;
    }
}