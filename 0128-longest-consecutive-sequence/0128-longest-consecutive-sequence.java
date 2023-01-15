class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int i : nums)
            set.add(i);
        
        int longest=0,count=0,currNum=0;
        for(int i : nums){
            if(!set.contains(i-1)){
                count=1;
                currNum=i;
            }
            
            while(set.contains(currNum+1)){
                count++;
                currNum=currNum+1;
            }
            
            longest=Math.max(longest,count);
        }
        return longest;
    }
}