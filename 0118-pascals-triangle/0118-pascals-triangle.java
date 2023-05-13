class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row;
        List<Integer> prev = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
row = new ArrayList<>();
for(int j=0;j<i;j++){
if(j==0 || j==i-1)
row.add(1);
else{
row.add(prev.get(j)+prev.get(j-1));
}
}
prev=row;
res.add(row);
}
return res;
    }
}
