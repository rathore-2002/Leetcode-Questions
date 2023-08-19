class Solution {
	public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
		int[][][] g = new int[n][n][2]; //{w,ind}
		for(int i = 0; i < edges.length; i ++) {
			int[] e = edges[i];
			int f = e[0];
			int t = e[1];
			int w = e[2];
			g[f][t][0] = w;
			g[t][f][0] = w;
			g[f][t][1] = i;
			g[t][f][1] = i;
		}

		List<Integer>[] mst = new List[n];
		for(int i = 0; i < n; i ++) {
			mst[i] = new LinkedList<>();
		}

		boolean[] mstSet = new boolean[edges.length];

        Arrays.sort(edges, (a,b) -> Integer.compare(a[2], b[2]));
        
        buildMST(n, edges, mstSet, mst, g);
		
		List<List<Integer>> ans = new ArrayList<>(2);
		Set<Integer> pce = new HashSet<>();
		List<Integer> ce = new LinkedList<>();
		
		// psuedo critical edges
		for(int i = 0; i < edges.length; i ++) {
            int f = edges[i][0], t = edges[i][1];
            int w = edges[i][2];
            int ind = g[f][t][1];
			if(!mstSet[ind]) {
                Set<Integer> cur = new HashSet<>();
				boolean p = path(f, t, w, -1, mst, g, cur);
                if(p && cur.size() > 0) {
                    pce.addAll(cur);
                    pce.add(ind);
                }
				if(!p) {
					System.out.println("Should not reach here");
				}
			}
			
		}

		// critical edges
		for(int i = 0; i < edges.length; i ++) {
            int f = edges[i][0], t = edges[i][1];
            int w = edges[i][2];
            int ind = g[f][t][1];
			if(mstSet[ind] && !pce.contains(ind)) {
				ce.add(ind);
			}
		}
		
		
		ans.add(ce);
		ans.add(new LinkedList<>(pce));
		return ans;

	}

	boolean path(int f, int t, int w, int p, List<Integer>[] mst, int[][][] g, Set<Integer> ind) {
		if(f == t) {
			return true; 
		}
		for(int nbr: mst[f]) {
			if(p != nbr) {
				
				if(path(nbr, t, w, f, mst, g, ind)) {
					if(g[f][nbr][0] == w) {
						ind.add(g[f][nbr][1]);
					}
					return true;
				}
				
			}
		}
		return false;
	}
    
    private void buildMST(int n, int[][] edges, boolean[] mste, List<Integer>[] mstg, int[][][] g){
        int weight = 0; 
        DisjointSet ds = new DisjointSet(n);
        
        for (int i = 0; i < edges.length; i++) {
            
            if (ds.union(edges[i][0], edges[i][1])) {
                weight += edges[i][2];
                int[] edge = edges[i];
                mstg[edge[0]].add(edge[1]);
                mstg[edge[1]].add(edge[0]);
                mste[g[edge[0]][edge[1]][1]] = true;
            }
        }
    }
}


class DisjointSet {
    int[] parent;
    
    public DisjointSet(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    
    public int find(int i) {
        return (i == parent[i]) ? i : (parent[i] = find(parent[i]));
    }
    
    public boolean union(int u, int v) {
        int pu = find(u), pv = find(v);
        if (pu == pv) {
            return false;
        }
        parent[pu] = pv;
        return true;
    }
}