class Solution {
  private boolean isVowel(char c) {
    return "AEIOUaeiou".indexOf(c) >= 0;
  }
  
  public boolean halvesAreAlike(String s) {
    var n = s.length();
    var cnt = 0;
    
    for (var i=0; i < n/2; i++)
      if (isVowel(s.charAt(i))) cnt++;
    
    for (var i = n/2; i < n; i++) {
      if (isVowel(s.charAt(i))) cnt--;
      if (cnt < 0) return false;
    }
    return cnt == 0;
  }
}