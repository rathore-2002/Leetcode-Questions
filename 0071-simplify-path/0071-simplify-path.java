class Solution {
   public String simplifyPath(String path) {
    Stack<String> stack = new Stack();
    for(String cur: path.split("/")){
        if(cur.equals("..")) {
            if(!stack.empty()) stack.pop();
        }
        else if(cur.length()>0 && !cur.equals(".")) stack.push(cur);
    }
    if(stack.isEmpty())  return "/";
       String ans="";
       while(!stack.isEmpty()){
           ans="/"+stack.pop()+ans;
       }
       return ans;
}
}