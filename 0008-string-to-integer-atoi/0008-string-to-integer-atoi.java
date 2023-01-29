class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s == null || s.length()<1)
            return 0;
        int i=0;
        if(s.charAt(0)=='+' || s.charAt(0)=='-')
            i=1;
        double res=0;
        for(;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                res=res*10+(s.charAt(i)-'0');
                
            }
            else
                break;
        }
        if(s.charAt(0)=='-')
            res=-res;
        
        if(res>Integer.MAX_VALUE)
            res=Integer.MAX_VALUE;
        if(res<Integer.MIN_VALUE)
            res=Integer.MIN_VALUE;
        
        return (int)res;
        
    }
}