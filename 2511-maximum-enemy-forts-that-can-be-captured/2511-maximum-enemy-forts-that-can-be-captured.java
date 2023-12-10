class Solution {
  public int captureForts(int[] forts) {
    final int n = forts.length;
    int result = 0;
    for (int i = 0, j = 0; i < n; i++) {
      if (forts[i] != 0) {
        if (forts[i] == -forts[j]) {
          result = Math.max(result, i - j - 1);
        }
        j = i;
      }
    }

    return result;
  }
}