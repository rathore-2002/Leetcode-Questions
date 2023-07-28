class Solution {
    int memo[][];
    public boolean PredictTheWinner(int[] nums) {
        memo=new int[nums.length][nums.length];
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            for(int j=0;j<nums.length;j++){
                memo[i][j]=-1;
            }
        }
        int p1Score=solve(nums,0,nums.length-1);
        int p2Score=total-p1Score;
        return (p1Score >= p2Score);
    }
    public int solve(int nums[],int i,int j){
        if(i>j){
            return 0;
        }
        if(memo[i][j]!=-1){
            return memo[i][j];
        }
        int choose_i = nums[i] + Math.min(solve(nums,i+2,j),solve(nums,i+1,j-1));
        int choose_j = nums[j] + Math.min(solve(nums,i+1,j-1),solve(nums,i,j-2));
        return memo[i][j]=Math.max(choose_i,choose_j);
    }
}