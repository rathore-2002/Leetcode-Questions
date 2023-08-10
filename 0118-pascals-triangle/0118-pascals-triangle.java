class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
      List<Integer> row;
      List<Integer> pre = new ArrayList<Integer>();
     for(int i=0;i<n;i++){
         row = new ArrayList<Integer>();
       for(int j=0;j<=i;j++){
          if(j==0 || j==i)
            row.add(1);
          else
              row.add(pre.get(j-1)+pre.get(j));
         }
           pre=row;
           ans.add(row);
        }
        return ans;
    }
}