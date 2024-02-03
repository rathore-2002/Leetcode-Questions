class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        return find(arr,0,0,0,k,map);
    }
    public int find(int arr[],int i,int max,int len,int k,HashMap<String,Integer> map){
        if(i>=arr.length){
            return max*len;
        }
        String str = i+" "+max+" "+len;
        if(map.containsKey(str)) return map.get(str);
        int last = 0,notLast = 0;
        last = max*len + find(arr,i+1,arr[i],1,k,map);
        if(len<k) notLast = find(arr,i+1,Math.max(max,arr[i]),len+1,k,map);
        map.put(str,Math.max(last,notLast));
        return Math.max(last,notLast);
    }
}