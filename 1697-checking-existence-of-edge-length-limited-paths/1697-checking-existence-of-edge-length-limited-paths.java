class Solution {
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        int nn = edgeList.length;
        int len = queries.length;
        boolean res[] = new boolean[len];
        int arr[][] = new int[len][4];
        for(int i = 0;i<len;i++){
            arr[i][0] = queries[i][0];
            arr[i][1] = queries[i][1];
            arr[i][2] = queries[i][2];
            arr[i][3] = i;
        }
        Arrays.sort(arr,(a,b) -> a[2] - b[2]);
        Arrays.sort(edgeList,(a,b) -> a[2] - b[2]);
        DSU obj = new DSU(n);
        int j = 0;
        for(int i = 0;i<len;i++){
            int a = arr[i][0];
            int b = arr[i][1];
            int dis = arr[i][2];
            int idx = arr[i][3];
            while(j<nn && edgeList[j][2] < dis){
                obj.union(edgeList[j][0], edgeList[j++][1]);
            }
            res[idx] = obj.findPar(a) == obj.findPar(b);
        }
        return res;
    }
}
class DSU{
    int par[];
    int rank[];
    DSU(int n){
        par = new int[n];
        rank = new int[n];
        for(int i = 0;i<n;i++){
            par[i] = i;
        }
    }
    int findPar(int n){
        if(n == par[n]) return n;
        return par[n] = findPar(par[n]);
    }
    void union(int u, int v){
        u = findPar(u);
        v = findPar(v);
        if(rank[u] < rank[v]){
            par[u] = v;
        }else if(rank[v] < rank[u]){
            par[v] = u;
        }else{
            par[v] = u;
            rank[u]++;
        }
    }
}