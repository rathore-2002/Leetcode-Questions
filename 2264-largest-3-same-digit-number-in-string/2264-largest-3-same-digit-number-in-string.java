class Solution {
    public String largestGoodInteger(String s) {
        int n = s.length();
        int num = 0;
        String ans = "";
        for(int i=0; i<n-2; i++){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2)){
                String a = s.substring(i,i+3);
                if(Integer.valueOf(a)>=num){
                    num = Integer.valueOf(a);
                    ans = a;
                }
            }
        }
        return ans;
    }
}