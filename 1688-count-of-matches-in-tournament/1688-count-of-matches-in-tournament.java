class Solution {
    public int numberOfMatches(int n) {
        int m=n;
        int t=0;
        while(m!=1){
            if(m%2!=0){
                m/=2;
                t+=m;
                m++;
                
            }
            else{
                m/=2;
                t+=m;
            }
        }
        return t;
        
    }
}

