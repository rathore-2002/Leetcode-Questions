class Solution {
    private boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')  
            return true;
        
        return false;
    }
    public int maxVowels(String s, int k) {
        int l=0,r=0,n=s.length(),max=0,count=0;
        for(;r<n;r++){
            if(isVowel(s.charAt(r)))     count++;
            for(;(r-l+1)>k;l++){
                if(isVowel(s.charAt(l)))   count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}