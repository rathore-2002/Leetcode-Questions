class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        
        String s2=s+s;
        if(s2.contains(goal))
            return true;
        
        return false;
    }
}