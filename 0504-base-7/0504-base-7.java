class Solution {
    public String convertToBase7(int num) {
        String ans="";
        int flag=0;
        if(num==0)   return ""+num;
        if(num<0)  flag=1;
        num=Math.abs(num);
        while(num!=0){
            int d=num%7;
            ans=""+d+ans;
            num/=7;
        }
        if(flag==1)
            return "-"+ans;
        return ans;
    }
}