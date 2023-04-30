class Solution {
    class DSU{
        int[] parent;
        int[] rank;
        int islands;

        DSU(int size){
            islands=size;
            parent = new int[size];
            rank = new int[size];
            for(int i=0; i<size; i++){
                parent[i]=i;
                rank[i]=0;
            }
        }
        public int find(int x){
            if(parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }
        public void union(int x, int y){
            int sx = find(x), sy=find(y);
            if(sx == sy){
                return;
            }
            if(rank[sx]>rank[sy]){
                parent[sy]=sx;
            } else if(rank[sx]<rank[sy]){
                parent[sx]=sy;
            } else {
                parent[sy]=sx;
                rank[sx]++;
            }
            islands--;
        }
        public boolean isSameSet(int x, int y){
            int sx = find(x), sy=find(y);
            if(sx == sy){
                return true;
            }
            return false;
        }
    }
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        DSU t1 = new DSU(n);
        DSU t2 = new DSU(n);
        int extra=0;
        for(int[] e : edges){
            int et = e[0], x=e[1]-1, y=e[2]-1;
            if(et==3){
                if(t1.isSameSet(x,y) && t2.isSameSet(x,y)){
                    extra++;
                    continue;
                }
                t1.union(x,y);
                t2.union(x,y);
            }
        }
        for(int[] e : edges){
            int et = e[0], x=e[1]-1, y=e[2]-1;
            if(et==1){
                if(t1.isSameSet(x,y)){
                    extra++;
                    continue;
                }
                t1.union(x,y);
            } else if(et==2){
                if(t2.isSameSet(x,y)){
                    extra++;
                    continue;
                }
                t2.union(x,y);
            }
        }
        if(t1.islands != 1 || t2.islands != 1){
            return -1;
        }
        return extra;
    }
}