//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans[] = obj.replaceWithRank(a,n);
      for(int e : ans)
      System.out.print(e+" ");
      System.out.println();
    }
  }
}

// } Driver Code Ends


//User function Template for Java


//User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
     // code here
     int ans[] = new int[arr.length];
     PriorityQueue<Integer> pq = new PriorityQueue<>();
     for(int i : arr){
         pq.add(i);
     }
     HashMap<Integer,Integer> map = new HashMap<>();
     int ctr=1;
     while(!pq.isEmpty()){
         if(map.containsKey(pq.peek()))              pq.remove();
         else
           map.put(pq.remove(),ctr++);
     }
      for(int i=0;i<arr.length;i++){
          ans[i]=map.get(arr[i]);
      }
      return ans;
  }
}
     