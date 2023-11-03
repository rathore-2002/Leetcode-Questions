class Solution {
   public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<String>();
        int curr=1, idx=0;
        while(idx<target.length){
            res.add("Push");
            if(curr!=target[idx]){
                res.add("Pop");
            } else{
                idx++;
            }
            curr++;
        }
        return res;
    }
}