class Solution {
    public boolean isAnagram(String s, String t) {
        char temp1[] = s.toCharArray();
        Arrays.sort(temp1);
        String s1=new String(temp1);
        char temp2[] = t.toCharArray();
        Arrays.sort(temp2);
        String s2=new String(temp2);
        
        if(s1.equals(s2))
            return true;
        else
            return false;
    }
}