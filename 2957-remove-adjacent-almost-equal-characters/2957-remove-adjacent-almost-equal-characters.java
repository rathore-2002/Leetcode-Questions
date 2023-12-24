class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int count=0;
        for(int i=0;i<word.length()-1;)
        {
            char c=word.charAt(i);
            char d=word.charAt(i+1);
            if(c==d || (c+1)==d || (c-1)==d)
            {
                count++;
                i+=2;
            }
            else
            {
                i++;
            }
        }
        return count;
    }
}