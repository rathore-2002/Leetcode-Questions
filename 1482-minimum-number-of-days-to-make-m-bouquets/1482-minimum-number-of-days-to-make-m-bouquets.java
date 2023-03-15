class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int s=1,e=bloomDay[0],ans=-1;
        for(int i=0;i<bloomDay.length;i++){
            e=Math.max(e,bloomDay[i]);
            s=Math.min(s,bloomDay[i]);
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(helper(bloomDay,mid,k)>=m)  {
                ans=mid;
                e=mid-1;
            }
            else                           s=mid+1;
        }
        return ans;
    }
    public int helper(int[] bloomDay,int mid,int k){
        int ctr=0,ans=0;
        for(int i : bloomDay){
            if(i<=mid)
                ctr++;
            else
                ctr=0;
                
             if(ctr==k)    {
                    ans++;
                    ctr=0;
                }
            
        }
        return ans;
    }
}