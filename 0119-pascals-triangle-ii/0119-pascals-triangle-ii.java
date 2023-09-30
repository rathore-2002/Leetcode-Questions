class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = null, prev_row = null;
        for(int i = 0; i <= rowIndex; i++){
            row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(prev_row.get(j-1) + prev_row.get(j));
                }
            }
            prev_row = row;
        }
        return row;
    }
}