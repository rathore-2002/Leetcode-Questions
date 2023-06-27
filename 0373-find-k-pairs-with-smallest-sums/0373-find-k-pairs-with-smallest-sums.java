class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
       List<List<Integer>> result = new ArrayList<>();

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);

    int n = nums1.length;
    int m = nums2.length;

    for(int i = 0; i < n; i++) 
    {
        for(int j = 0; j < m; j++) 
        {
            int sum = nums1[i] + nums2[j];
            
            if(pq.size() < k) {
                pq.add(new int[]{nums1[i], nums2[j], sum});
            }
            else
            {
                if(sum < pq.peek()[2])
                {
                    pq.poll();
                    pq.add(new int[]{nums1[i], nums2[j], sum});
                }
                else
                    break;
            }
        }
    }

    while(!pq.isEmpty()) 
    {
        int[] pair = pq.poll();
        List<Integer> pairList = new ArrayList<>();
        pairList.add(pair[0]);
        pairList.add(pair[1]);
        result.add(0, pairList);
    }

    return result;        
}
}        
