class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int a=!st.isEmpty()? st.pop() : 0;
                int b=!st.isEmpty()? st.pop() : 0;
                if(s.equals("+")) st.push(a+b);
                else if(s.equals("-")) st.push(b-a);
                else if(s.equals("*")) st.push(a*b);
                else if(s.equals("/")) st.push(b/a);
            }
            else
                st.push(Integer.parseInt(s));
        }
        return st.isEmpty()? 0 : st.pop();
    }
}