class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0,e=0,n=s.length(),ans=0;
        int cost=0;
        for(;e<n;e++){
            cost+=Math.abs((s.charAt(e)-t.charAt(e)));
            for(;cost>maxCost;l++){
                cost-=Math.abs((s.charAt(l)-t.charAt(l)));
            }
            ans=Math.max(ans,e-l+1);
        }
        return ans;
    }
}