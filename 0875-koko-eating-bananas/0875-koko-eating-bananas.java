class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e = piles[0];
        for(int i = 0;i<piles.length;i++){
            e=Math.max(e,piles[i]);
        }
        while(s<e){
            int mid=s+(e-s)/2;
            if(helper(piles,mid)<=h)  e=mid;
            else if(helper(piles,mid)>h) s=mid+1;
        }
        return s;
    }
    public int helper(int[] piles,int k){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%k==0)   hours+=piles[i]/k;
            else             hours+=piles[i]/k + 1;
        }
        return hours;
    }
}