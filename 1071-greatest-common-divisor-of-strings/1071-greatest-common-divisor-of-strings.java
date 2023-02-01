class Solution {

    public static String gcdOfStrings(String str1, String str2) {
        String smallerString = str1.length() > str2.length() ? str2 : str1;
        String biggerString = str1.length() > str2.length() ? str1 : str2;

        return gcd(biggerString, smallerString);
    }

    public static String gcd(String str1, String str2){
        if(str1.equals(str2)){
            return str1;
        }
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }

        return "";
    }
}
