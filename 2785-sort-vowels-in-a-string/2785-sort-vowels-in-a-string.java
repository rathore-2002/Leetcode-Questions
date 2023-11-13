class Solution {
    public String sortVowels(String s) {
        StringBuilder ans = new StringBuilder("");

        ArrayList<Character> arr = new ArrayList<>();

        int n = s.length();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') arr.add(ch);
        }

        Collections.sort(arr);
        int idx = 0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                ans.append(arr.get(idx++));
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}