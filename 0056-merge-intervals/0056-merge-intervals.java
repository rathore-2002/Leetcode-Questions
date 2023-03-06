class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if(intervals.length==0 || intervals==null) 
            return res.toArray(new int[0][]);
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int s=intervals[0][0];
        int e=intervals[0][1];
        for(int[] i : intervals){
            if(i[0]<=e)
                e=Math.max(e,i[1]);
            else{
                res.add(new int[]{s,e});
                s=i[0];
                e=i[1];
            }
        }
        res.add(new int[]{s,e});
        return res.toArray(new int[0][]);
    }
}