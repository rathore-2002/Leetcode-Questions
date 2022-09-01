class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int ans=-1;
        int n=citations.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(citations[mid]==n-mid)
                return citations[mid];
            else if(citations[mid]<n-mid)
                s=mid+1;
            else
                e=mid-1;
        }
        return n-s;
    }
}