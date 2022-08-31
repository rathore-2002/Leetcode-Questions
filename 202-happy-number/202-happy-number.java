class Solution {
    public int sum(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s+=d*d;
            n=n/10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        
       HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            n=sum(n);
        if(set.contains(n))
            return false;
        else
            set.add(n);
            
        }
         
            return true;
        
            
    }
}