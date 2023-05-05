class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0,r=0,n=s.length(),ans=0;
        int sum=0;
        for(;r<n;r++){
            sum+=Math.abs(t.charAt(r)-s.charAt(r));
            for(;sum>maxCost;l++){
                sum-=Math.abs(t.charAt(l)-s.charAt(l));
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}