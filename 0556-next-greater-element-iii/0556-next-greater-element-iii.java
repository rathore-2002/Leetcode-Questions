class Solution {
    public int nextGreaterElement(int n) {
        String str=String.valueOf(n);
        char []ch=str.toCharArray();
        
        int i=ch.length-2;
        
        while(i>=0 && ch[i+1]<=ch[i]){
            i--;
        }
        
        if(i==-1){
            return -1;
        }
        
        int j=ch.length-1;
        
        while(ch[j]<=ch[i]){
            j--;
        }
        
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        
        StringBuilder sb=new StringBuilder();
        
        for(int k=0;k<=i;k++){
            sb.append(ch[k]);
        }
        
        for(int k=ch.length-1;k>i;k--){
            sb.append(ch[k]);
        }
        
        str=sb.toString();
        try{
            int ans=Integer.parseInt(str);
            return ans;
        }catch(Exception e){
            return -1;
        }
    }
}