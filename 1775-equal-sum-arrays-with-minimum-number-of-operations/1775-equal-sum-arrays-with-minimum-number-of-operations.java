import java.util.*;
class Number {
    public Integer val;
    public boolean toIncrease;
    public Integer difference;
    public Number(int x, boolean y) {
        this.val = x;
        if (y == true) {
            this.difference = 6-x;
        } else {
            this.difference = x-1;
        }
    }
    @Override
    public String toString() {
        return val + " " + toIncrease + " " + difference;
    }
}

class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        int sum1 = 0;
        int sum2 = 0;
        PriorityQueue<Number> pq = new PriorityQueue<>((a,b) -> {
            return -a.difference.compareTo(b.difference);
        });
        
        for (int i = 0; i < nums1.length; i += 1) {
            sum1 += nums1[i];
        }
        for (int i = 0; i < nums2.length; i += 1) {
            sum2 += nums2[i];
        }
        int difference = Math.abs(sum1-sum2);
        if (difference == 0) {
            return 0;
        }
        if (sum1 < sum2) {
            for (int i = 0; i < nums1.length; i += 1) {
                pq.add(new Number(nums1[i], true));
            }
            for (int i = 0; i < nums2.length; i += 1) {
                pq.add(new Number(nums2[i], false));
            }
        } else {
            for (int i = 0; i < nums1.length; i += 1) {
                pq.add(new Number(nums1[i], false));
            }
            for (int i = 0; i < nums2.length; i += 1) {
                pq.add(new Number(nums2[i], true));
            }
        }
        //System.out.println(pq);
        int count = 0;
        while (difference != 0) {
            int curr = pq.poll().difference;
			//If difference is positive and current difference is zero, means we can no longer work towards decreasing the difference. Return -1
            if (curr == 0) {
                return -1;
            }
			//Means we have more than enough current difference
            if (difference <= curr) {
                count +=1;
                return count;
            }
            difference -= curr;
            count += 1;
        }
        return count;

    }
}