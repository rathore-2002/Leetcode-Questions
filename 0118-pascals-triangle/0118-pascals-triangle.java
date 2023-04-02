class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> ans;
        List<Integer> prev = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ans=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)        ans.add(1);
                else{
                    ans.add(prev.get(j)+prev.get(j-1));
                }
            }
            prev=ans;
            res.add(ans);
        }
        return res;
    }
}


