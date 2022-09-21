class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
                if(stack.size()>1){
                    ans+='(';
                }
            }
            else if(s.charAt(i)==')'){
                
            if(stack.peek()=='(' && stack.size()>1){
                ans+=')';
            }
                stack.pop();
        }
        }
            return ans;
    }
}