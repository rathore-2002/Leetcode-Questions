//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GfG {
    

	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String S[] = br.readLine().split(" ");
            
            long a = Long.parseLong(S[0]);
            
            long b = Long.parseLong(S[1]);
	       
	    	Solution ob = new Solution();
           
            System.out.println(ob.divide(a,b));
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static long divide(long a, long b)
    {
        //code here
          int sign=1;
       if( (a<0 && b>0)|| (a>0 && b<0))
        sign=-1;
       
        long x=0,y=0,ans=0;
        a=Math.abs(a);
        b=Math.abs(b);
              
              
             while((a-b)>=0)
             {
                 while(a-(b<<x)>=0)
                  { x++;}
                 
                 x--;
                 ans+=(1L<<(x));
                 a-=b<<x;
                 x=0;
             }
            return sign*ans;
    }
}