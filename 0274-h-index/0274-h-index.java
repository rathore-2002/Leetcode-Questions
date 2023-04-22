class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(citations[mid]==n-mid)      return citations[mid];
            else if(citations[mid]>n-mid)     e=mid-1;
            else                              s=mid+1;
        }
        return n-s;
    }
}