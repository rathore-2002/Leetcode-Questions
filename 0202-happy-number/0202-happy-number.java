class Solution {
    public int getSum(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s+=d*d;
            n/=10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n!=1){
            n=getSum(n);
            
            if(map.containsKey(n))      return false;
            else   map.put(n,map.getOrDefault(n,0)+1);
        }
        if(n==1)       return true;
        return false;
    }
}


