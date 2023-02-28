class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int s=i+1;
                int e=nums.length-1;
                int sum=0-nums[i];
                while(s<e){
                    if(nums[s]+nums[e]==sum){
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[s]);
                        ans.add(nums[e]);
                        res.add(ans);
                        
                        while(s<e && nums[s]==nums[s+1]) s++;
                        while(s<e && nums[e]==nums[e-1]) e--;
                        
                        s++;
                        e--;
                    }
                    else if(nums[s]+nums[e]<sum)    s++;
                    else                            e--;
                }
            }
        }
        return res;
    }
}