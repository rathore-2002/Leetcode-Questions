class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s==null)
            return true; 
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                stack.push(c);
            
               else if (stack.size() == 0 || 
                     c == ')' && stack.pop() != '(' || 
                     c == '}' && stack.pop() != '{' || 
                     c == ']' && stack.pop() != '[') {
                    return false;
            
            }
        }
        if(stack.isEmpty())
            return true;
        else return false;
    }
}