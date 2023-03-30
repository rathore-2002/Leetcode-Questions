class Solution {
    public int findCircleNum(int[][] isConnected) {
        //counter for number of connected components
        int ans = 0;
        int n = isConnected.length;
        //visited array to keep track of visited nodes
        boolean[] visited = new boolean[n + 1];
        
        for(int i=1;i<=n;i++) {
            //If node not visited
            if(!visited[i]) {
                dfs(isConnected, visited, i, n);
                //increment counter
                ans++;
            }
        }
        return ans;
    }
    static void dfs(int[][] isConnected, boolean[] visited, int source, int n) {
        //Simple DFS
        visited[source] = true;
        for(int j=0;j<n;j++) {
            //skip for self 
            if(source - 1 != j) {
                //If connected and is still not visited
                if(isConnected[source - 1][j] == 1 && !visited[j + 1]) {
                    dfs(isConnected, visited, j + 1, n);
                }
            }
        }
    }
}