class Solution {
    public int findCircleNum(int[][] isConnected) {
         int v = isConnected.length;
        int[] visited = new int[v];
        int cnt = 0;
        for(int i = 0; i<v; i++)
        {
            if(visited[i] == 0)
            {
                cnt++;
                dfs(i, isConnected, visited);
            }
        }
        return cnt;
    }
    public void dfs(int start, int[][] isConnected, int[] visited)
    {
        visited[start] = 1;
        for(int j = 0; j<isConnected.length; j++)
        {
            if(isConnected[start][j] == 1 && visited[j] == 0)
            {
                dfs(j, isConnected, visited);
            }
        }
    }
}