class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
         
       if(nums.length<4)
            return res;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int s=j+1;
                int e=nums.length-1;
                while(s<e){
                    long sum=(long)nums[i]+(long)nums[j]+(long)nums[s]+(long)nums[e];
                    if(sum==target){
                       List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[s]);
                        temp.add(nums[e]);
                        if(!set.contains(temp)){
                        res.add(temp);
                        set.add(temp);
                        }
                        s++;
                        e--;
                    }
                    
                   else if(sum<target)
                        s++;
                    
                    else
                        e--;
                }
            }
        }
        return res;
    }
}