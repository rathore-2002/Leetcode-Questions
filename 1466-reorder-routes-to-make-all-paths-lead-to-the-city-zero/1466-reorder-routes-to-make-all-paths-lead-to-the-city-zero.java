class Solution {
    int dfs(List<List<Integer>> gr, boolean[] visited, int from) {
        int change = 0;
        visited[from] = true;
        for (var to : gr.get(from))
            if (!visited[Math.abs(to)])
                change += dfs(gr, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
        return change;   
    }
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> gr = new ArrayList<>();
        for(int i = 0; i < n; ++i) 
            gr.add(new ArrayList<>());
        for (var c : connections) {
            gr.get(c[0]).add(c[1]);
            gr.get(c[1]).add(-c[0]);
        }
        return dfs(gr, new boolean[n], 0);
    }
}