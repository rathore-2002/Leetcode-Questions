class Solution {
    public int maximumScore(List<Integer> nums, int k) {
        int[] f = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            f[i] = primeFactor(nums.get(i));
        }
        
        Stack<Integer> stack = new Stack();
        int[] count = new int[f.length];
        for (int i = 0; i < f.length; i++) {
            while ( ! stack.isEmpty() && f[stack.peek()] < f[i]) {
                stack.pop();
            }
            count[i] = (stack.isEmpty()) ? i+1 : i-stack.peek();
            stack.add(i);
        }
        
        stack.clear();
        for (int i = f.length-1; i >= 0; i--) {
            while ( ! stack.isEmpty() && f[stack.peek()] <= f[i]) {
                stack.pop();
            }
            int c = (stack.isEmpty()) ? f.length-i : stack.peek()-i;
            
            count[i] = (int)((long)count[i]*c % 1000000007);
            stack.add(i);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>( (int[] v1, int[] v2) -> Integer.compare(v2[0], v1[0]) );
        
        for (int i = 0; i < f.length; i++) {
            if (count[i] == 0) {
                continue;
            }
            pq.add(new int[]{nums.get(i), count[i]});
        }
        
        long score = 1;
        while ( k > 0 && ! pq.isEmpty()) {
            int[] next = pq.poll();
            int m = Math.min(k, next[1]);
            score = (score * binPow(next[0], m)) % 1000000007;            
            k-= m;
        }
        
        return (int)score;
    }
    
    public static int primeFactor(int n)
    {
        HashSet<Integer> set = new HashSet<>();
        while (n%2==0) {
            set.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            while (n%i == 0) {
                set.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            set.add(n);
        }
        
        return set.size();
    }

    public static long binPow(long a, long n) {
        long MOD = 1000000007;
        long res = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a*a)% MOD;
            n >>= 1;
        }
        return res;
    }
}