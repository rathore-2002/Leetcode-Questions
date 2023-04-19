//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] nums, int n, int target) {
        // code here
         int first=-1,last=-1;
        int s=0,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                first=mid;
                e=mid-1;
            }
            else if(nums[mid]<target)        s=mid+1;
            else                             e=mid-1;
        }
        int s1=0,e1=nums.length-1;
        while(s1<=e1){
             int mid=s1+(e1-s1)/2;
            if(nums[mid]==target){
                last=mid;
                s1=mid+1;
            }
            else if(nums[mid]<target)        s1=mid+1;
            else                             e1=mid-1;
        }
        if(first==-1 && last==-1)          return 0;
        return last-first+1;
    }
}