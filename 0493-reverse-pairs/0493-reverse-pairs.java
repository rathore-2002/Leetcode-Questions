class Solution {
   public int reversePairs(int[] nums) {
        return merger(0,nums.length-1,nums);
    }
    
    private int merger(int start,int end,int ar[]){
        if (start >= end) return 0;
            int mid = (start + end) / 2;
            int cnt = merger(start,mid,ar);
            cnt += merger(mid+1,end,ar);
            cnt += merge(start,mid,end,ar);
            return cnt;
        
    }
    
    private int merge(int start,int mid,int end,int[] ar){
        int max_cnt = 0;
        int j = mid+1;
        for (int i=start;i<=mid;i++){
            while (j<=end && ar[i] > (2*(long)ar[j])) j++;
            max_cnt += j - (mid+1);
        }
        
        List<Integer> list = new ArrayList<>();
        int i = start;
        j = mid+1;
        
        while (i <= mid && j <= end){
            if (ar[i] < ar[j]) list.add(ar[i++]);
            else list.add(ar[j++]);
        }
        
        while (i <= mid) list.add(ar[i++]);
        while (j <= end) list.add(ar[j++]);
        
        for (int x=start;x<=end;x++){
            ar[x] = list.get(x-start);
        }
        return max_cnt;
    }
}