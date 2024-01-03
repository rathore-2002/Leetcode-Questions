class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Pair[] arr = new Pair[map.size()];
        int k=0;
        for(Character c : map.keySet()){
            arr[k++] = new Pair(c,map.get(c));
        }
        Arrays.sort(arr,(a,b)->b.count-a.count);
        String ans="";
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].count;j++)
                ans+=arr[i].c;
        }
        return ans;
    }
}
class Pair{
    char c;
    int count;
    public Pair(char c,int count){
        this.c=c;
        this.count=count;
    }
}