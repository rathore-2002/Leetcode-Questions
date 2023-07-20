class Solution {
   public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        for(int i=0;i<n;i++){
            if(asteroids[i]<0){
                int flag = 0;
                while(!st.isEmpty() && st.peek()>0 && st.peek()<=Math.abs(asteroids[i])){
                    if(st.peek()==Math.abs(asteroids[i])){
                        flag = 1;
                        st.pop();
                        break;
                    }else
                        st.pop();
                }
                if(flag ==1)
                    continue;
                if(st.isEmpty() || st.peek()<0){
                    st.push(asteroids[i]);
                }
                
            }else{
                st.push(asteroids[i]);
            }
        }
        int len = st.size();
        int ans[] = new int[st.size()];
        while(!st.isEmpty()){
            ans[--len] = st.pop();
        }
        return ans;
    }
}