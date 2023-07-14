class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> nm=new HashMap<>();
        nm.put(arr[0],1);
        for(int i=1;i<arr.length;i++)
        {
            int value=arr[i]-difference;
            if(nm.containsKey(value))
            {
                nm.put(arr[i],nm.get(value)+1);
            }
            else
            {
                nm.put(arr[i],1);
            }
        }
        int ans=1;
        for(int i:nm.keySet())
        {
            ans=Math.max(ans,nm.get(i)); 
        }
        return ans;
    }
}