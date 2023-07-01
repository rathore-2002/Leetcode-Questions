class Solution {
  int children[], ans = Integer.MAX_VALUE;

  private void backTrack(int[] cookies, int i) {
    for (var j=0; j < children.length; j++) {
      children[j] += cookies[i];

      if (i == cookies.length - 1) {
        var max = 0;
        for (var a : children) max = Math.max(max, a);
        ans = Math.min(ans, max);
      } else {
        backTrack(cookies, i+1);
      }
      children[j] -= cookies[i];
    }
  }

  public int distributeCookies(int[] cookies, int k) {
    children = new int[k];
    backTrack(cookies, 0);
    return ans;
  }
}