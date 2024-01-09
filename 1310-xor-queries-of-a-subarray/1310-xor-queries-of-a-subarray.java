class Solution {
    public int[] xorQueries(int[] A, int[][] queries) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            A[i] = (A[i - 1] ^ A[i]);
        }
        int ans[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
			int left = queries[i][0]-1<0?0:A[queries[i][0]-1];
			int right = A[queries[i][1]];
            ans[i] = ( left^right);
        }

        return ans;
    }
}