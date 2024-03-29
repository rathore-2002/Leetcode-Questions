class Solution {
    public int minimumCardPickup(int[] cards) {
        int l=0,e=0,n=cards.length,ans=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(;e<n;e++){
            map.put(cards[e],map.getOrDefault(cards[e],0)+1);
            for(;map.get(cards[e])>1;l++){
                ans=Math.min(ans,e-l+1);
                if(map.get(cards[l])==1)         map.remove(cards[l]);
                else                             map.put(cards[l],map.get(cards[l])-1);
            }
        }
        return ans==Integer.MAX_VALUE? -1 : ans;
    }
}