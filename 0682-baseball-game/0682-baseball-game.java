class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C") && !st.isEmpty())
                st.pop();
            else if(operations[i].equals("D") && !st.isEmpty()){
                st.push(st.peek()*2);
                
            }
            else if(operations[i].equals("+") && !st.isEmpty()){
                int a=st.pop();
                int s=(!st.isEmpty())? a+st.peek() : a;
                st.push(a);
                st.push(s);
            }
            else
                st.push(Integer.parseInt(operations[i]));
                
        }
        while(!st.isEmpty())
            sum+=st.pop();
        
        return sum;
    }
}