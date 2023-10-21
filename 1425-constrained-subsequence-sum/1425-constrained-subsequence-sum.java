import static java.lang.Integer.MIN_VALUE;
import static java.lang.Math.max;

import java.util.ArrayDeque;

class Solution {
    public int constrainedSubsetSum(int[] A, int k) {
        var dq = new ArrayDeque<Data>();
        int output = MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (!dq.isEmpty() && i - dq.peekFirst().i > k)
                dq.pollFirst();

            int x = max(0, dq.isEmpty() ? 0 : dq.peekFirst().x) + A[i];

            output = max(output, x);

            while (!dq.isEmpty() && dq.peekLast().x < x)
                dq.pollLast();

            dq.addLast(new Data(i, x));
        }

        return output;
    }

    private record Data(int i, int x) {}

}