class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int start = 0;
        int end = 0;
        int sum = 0;
        k = cardPoints.length - k;
        int ans = Integer.MAX_VALUE;
        int totalSum = 0;

        for(int i = 0; i < cardPoints.length; i++) {
            totalSum += cardPoints[i];
        }

        if(k == 0) {
            return totalSum;
        }

      for(;end<cardPoints.length;end++){
          sum+=cardPoints[end];
          for(;end-start+1>k;start++){
              sum-=cardPoints[start];
          }
          if(end-start+1==k)  ans=Math.min(ans,sum);
      }
        return totalSum - ans;
    }
}
