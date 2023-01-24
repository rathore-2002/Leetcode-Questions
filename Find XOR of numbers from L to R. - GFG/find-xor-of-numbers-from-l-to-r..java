//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int l;
            l = sc.nextInt();

            int r;
            r = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.findXOR(l, r);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    private static int XOR(int n){
        int x=0;
        if(n%4==0)   x=n;
        else if(n%4==1)   x=1;
        else if(n%4==2)   x=n+1;
        else if(n%4==3)   x=0;
        
        return x;
    }
    public static int findXOR(int l, int r) {
        return XOR(r)^XOR(l-1);
    }
}