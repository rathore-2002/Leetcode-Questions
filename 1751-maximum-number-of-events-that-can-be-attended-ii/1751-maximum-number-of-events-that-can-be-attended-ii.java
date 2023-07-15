class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events,(ar1,ar2) -> ar1[0]-ar2[0]);
        int dp[][]=new int[k+1][events.length];
        return solve(events,dp,k,0);
    }
    public int solve(int events[][],int dp[][],int k,int idx){
        if(k==1){
            int ans=0;
            for(int i=idx;i<events.length;i++){
                ans=Math.max(ans,events[i][2]);
            }
            return ans;
        }
        if(dp[k][idx]!=0){
            return dp[k][idx];
        }
        int ans=0;
        for(int i=idx;i<events.length;i++){
            int val=events[i][2];
            for(int j=i+1;j<events.length;j++){
                if(events[j][0]>events[i][1]){
                    ans = Math.max(ans,val+solve(events,dp,k-1,j));
                }
            }
            ans=Math.max(ans,val);
        }
        return dp[k][idx]=ans;
    }
}