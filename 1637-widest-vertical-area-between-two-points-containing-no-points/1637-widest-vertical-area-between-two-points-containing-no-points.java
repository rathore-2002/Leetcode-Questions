class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (p1, p2)->(p1[0]-p2[0]));
        int maxWidth = 0, sz = points.length;
        for(int indx = 0; indx < sz-1; indx++){
           int [] point1 = points[indx], point2 = points[indx+1]; 
           maxWidth = Math.max(maxWidth, point2[0] - point1[0]);
        }
        return maxWidth;
    }
}