class Solution {
    int[] parents;
    
    private int find(int x){
        if(x != parents[x]) 
            parents[x] = find(parents[x]);
        return parents[x];
    }
    
    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        int n = vals.length;
        if(n == 1) return 1;
        // 1. init union find and ids arrayList
        parents = new int[n];
        List<Integer> ids = new ArrayList<>();
        for(int i = 0; i < n; i++){
            parents[i] = i;
            ids.add(i);
        }
        
        // build Graph
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            graph.putIfAbsent(u, new HashSet<>());
            graph.putIfAbsent(v, new HashSet<>());
            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        // 2. sort the ids by vals
        Collections.sort(ids, (a, b) -> (vals[a] - vals[b]));
        
        // 3. iterate from smallest to biggest
        int ret = 0;
        for (int i = 0; i < n; i++) {
            // get all same vals of node ids[i, j)
            int j = i + 1;
            while(j < n && vals[ids.get(j)] == vals[ids.get(i)]) j++;
            
            // enum each same val
            for (int k = i; k < j; k++) {
                int x = ids.get(k);
                // traverse neighbor, if small than current node
                for(int neighbor : graph.get(x)){
                    if (vals[x] >= vals[neighbor]) {
                        // union node x and its smaller neighbor
                        parents[find(x)] = find(neighbor);
                    }
                }
            }
            // checkout for current values, the # of val in each component 
            Map<Integer, Integer> temp = new HashMap<>();
            for(int k = i; k < j; k++){
                int root = find(ids.get(k));
                temp.put(root, temp.getOrDefault(root, 0) + 1);  // # of current val in the {root} group
            }
			// standalone nodes are included. Note C(n, 2) + n = C(n + 1, 2)
            for (int v : temp.values()){
                ret += v * (v + 1) / 2;
            }
            
            i = j - 1;
        }
        
        return ret;
    }
}