class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        int n = nums.length;
        int m = queries.length;
        int[] answer = new int[m];
  
 // sort nums in non-decreasing order
         Arrays.sort(nums);
  
  // for each query, find the maximum size of a subsequence that has a sum less than or equal to the query
        for (int i = 0; i < m; i++) {
          int query = queries[i];
          int sum = 0;
          int size = 0;
             for (int j = 0; j < n; j++) {
                sum += nums[j];
                if (sum > query) {
                 break;
                 }
                 size++;
             }
        answer[i] = size;
  }
  
  return answer;
    }
}