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
class Solution {

    static int[] replaceWithRank(int arr[], int n) {

    // code here

        int brr[] = arr.clone();

        Arrays.sort(brr);

        

        HashMap<Integer, Integer>hm = new HashMap<>();

        //(element, rank)

        int rank = 1;

        for(int i=0; i<n; i++){

            if(hm.get(brr[i]) == null){

                hm.put(brr[i], rank++);

            }

        }

        int ans[] = new int[n];

        for(int i=0; i<n; i++){

            ans[i] = hm.get(arr[i]);

        }

        return ans;

        

    }

}