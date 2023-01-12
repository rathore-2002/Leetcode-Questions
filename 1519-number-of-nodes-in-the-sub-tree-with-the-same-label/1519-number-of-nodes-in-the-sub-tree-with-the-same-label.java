class Solution {
    public int[] res(int idx,int n,ArrayList<ArrayList<Integer>>arr,String labels, int ans[],int counts[],int vis[]){
        vis[idx]=1;
        ArrayList<Integer>ele=arr.get(idx);
        int c[]=new int[26];
        for(int i=0;i<ele.size();i++){
            if(vis[ele.get(i)]==0){
            int l[]=res(ele.get(i),n,arr,labels,ans,c,vis);
                for(int j=0;j<26;j++){
                    c[j]+=l[j];
                }
            }
        }
        c[labels.charAt(idx)-'a']++;
        ans[idx]=c[labels.charAt(idx)-'a'];
        return c;
    }
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            arr.get(edges[i][0]).add(edges[i][1]);
            arr.get(edges[i][1]).add(edges[i][0]);
        }
        int vis[]=new int[n];
        int ans[]=new int[n];
        int counts[]=new int[26];
        int []l=res(0,n,arr,labels,ans,counts,vis);
        return ans;
        
    }
}