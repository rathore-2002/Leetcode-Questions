class Solution {
    public int lengthOfLastWord(String s) {
        int ctr=0;
        String str=s.trim();
        int i=str.length()-1;
            while(str.charAt(i)!=' ' ){
                ctr++;
                i--;
                if(i<0)
                    return ctr;
            }
        
        return ctr;
    }
}