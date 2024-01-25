class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int i1=0, i2=0, i3=0;
        int m1 = s1.length(), m2 = s2.length(), m3 = s3.length();
        if(s1.charAt(i1) != s2.charAt(i2++) || s1.charAt(i1++) != s3.charAt(i3++))
            return -1;
        
        while(i1<m1 && i2<m2 && i3<m3){
            if(s1.charAt(i1) != s2.charAt(i2) || s1.charAt(i1) != s3.charAt(i3)){
                    return (m1-i1) + (m2-i2) + (m3-i3); 
            }
            i1++;
            i2++;
            i3++;
        }
        return (m1-i1) + (m2-i2) + (m3-i3);
    }
}