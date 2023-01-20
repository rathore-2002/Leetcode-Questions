class Solution {
     List<List<Integer>>l=new ArrayList();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtrack(0,nums,new ArrayList(),Integer.MIN_VALUE);
        return l;
    }
    public void backtrack(int i,int[]nums,ArrayList<Integer>row,int previous){
        if(i==nums.length){
            if(row.size()>1){
              l.add(new ArrayList<>(row));
            }
            return;
        }
        if(nums[i]>=previous){
        row.add(nums[i]);
        backtrack(i+1,nums,row,nums[i]);
        row.remove(row.size()-1);
        }
        if(nums[i]==previous){
            return;
        }
        backtrack(i+1,nums,row,previous);
    }
}