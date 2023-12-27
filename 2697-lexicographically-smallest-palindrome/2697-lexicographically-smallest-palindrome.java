class Solution {
    public String makeSmallestPalindrome(String s) {
     
       char []ch=s.toCharArray();
       
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(ch[i]<ch[j])ch[j]=ch[i];
            else if(ch[i]>ch[j])ch[i]=ch[j];
            i++;
            j--;
        }
        StringBuilder S=new StringBuilder();
        for(char c:ch) S.append(c);
        
        return S.toString();
    }
}