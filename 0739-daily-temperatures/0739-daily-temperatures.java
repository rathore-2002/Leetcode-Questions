class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        
        int ans[] = new int[temperatures.length];
        
        for(int curr_day = 0; curr_day < n ; curr_day++){
            
            int curr_temp = temperatures[curr_day] ;
            while(!stack.isEmpty() && temperatures[stack.peek()] < curr_temp ){
                int prev_day = stack.pop();
                ans[prev_day] = curr_day - prev_day;
            } 
            stack.push(curr_day);
        }
        
        return ans;
    }
}