class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
                if(st.size()>1)              ans+='(';
            }
            else if(s.charAt(i)==')'){
                if(st.size()>1){
                ans+=')';
            }
                st.pop();
            }
        }
        return ans;
    }
}