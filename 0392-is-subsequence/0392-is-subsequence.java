class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<t.length() && j<s.length()){
            if(t.charAt(i)==s.charAt(j))
                j++;
            i++;
        }
        if(j<s.length() && i>=t.length())       return false;
        return true;
    }
}