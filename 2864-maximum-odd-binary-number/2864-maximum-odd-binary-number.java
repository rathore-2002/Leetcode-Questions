class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ctro=0,ctr1=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')  ctro++;
            else if(s.charAt(i)=='1')   ctr1++;
        }
        ans+="1";
        for(int i=0;i<ctro;i++)    ans='0'+ans;
        for(int i=0;i<ctr1-1;i++)  ans='1'+ans;
        
        return ans;
    }
}