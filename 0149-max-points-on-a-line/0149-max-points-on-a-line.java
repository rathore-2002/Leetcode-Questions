class Solution {
    public int maxPoints(int[][] points) {
        int maxPoints = 0;
    for (int i = 0; i < points.length; i++) {
      int[] point1 = points[i];
      for (int j = i + 1; j < points.length; j++) {
        int[] point2 = points[j];
        double slope = (double) (point2[1] - point1[1]) / (point2[0] - point1[0]);
        int numPointsOnLine = 2;  // point1 and point2 are already on the line
        for (int k = 0; k < points.length; k++) {
          if (k == i || k == j) {
            continue;  // skip point1 and point2
          }
          int[] point3 = points[k];
          if ((double) (point3[1] - point1[1]) / (point3[0] - point1[0]) == slope) {
            numPointsOnLine++;
          }
        }
        maxPoints = Math.max(maxPoints, numPointsOnLine);
      }
    }
    if(maxPoints==0)
    return 1;
    return maxPoints;
    }
}