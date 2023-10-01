class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,e=0,n=fruits.length,ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(;e<n;e++){
            map.put(fruits[e],map.getOrDefault(fruits[e],0)+1);
            for(;map.size()>2;l++){
                if(map.get(fruits[l])==1)         map.remove(fruits[l]);
                 else                             map.put(fruits[l],map.get(fruits[l])-1);
            }
            ans=Math.max(ans,e-l+1);
        }
        return ans;
    }
}