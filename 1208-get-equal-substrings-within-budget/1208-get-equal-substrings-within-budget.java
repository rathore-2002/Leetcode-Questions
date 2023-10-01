class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0,e=0,n=s.length(),ans=0;
        int sum=0;
        for(;e<n;e++){
            sum+=Math.abs((int)(s.charAt(e))-(int)(t.charAt(e)));
            for(;sum>maxCost;l++){
                sum-=Math.abs((int)(s.charAt(l))-(int)(t.charAt(l)));
            }
            ans=Math.max(ans,e-l+1);
        }
        return ans;
    }
}