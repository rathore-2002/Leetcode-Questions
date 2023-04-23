class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        int vis[] = new int[v];
        int count=0;
        for(int i=0;i<v;i++){
            if(vis[i]==0){
                count++;
                dfs(i,isConnected,vis);
            }
        }
        return count;
    }
    
    private void dfs(int curr,int[][] isConnected,int[] vis){
        vis[curr]=1;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[curr][j]==1 && vis[j]==0)   
                dfs(j,isConnected,vis);
        }
    }
   
}