class Solution {
    public String simplifyPath(String path) {
        HashSet<String> set = new HashSet<>(Arrays.asList("..",".",""));
        Stack<String> st = new Stack<>();
        for(String s : path.split("/")){
            if(s.equals("..") && !st.isEmpty())  st.pop();
            else if(!set.contains(s))  st.push(s);
        }
       if(st.isEmpty())  return "/";
       String ans="";
       while(!st.isEmpty()){
           ans="/"+st.pop()+ans;
       }
       return ans;
    }
}