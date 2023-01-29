//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	// Your code here
	if(str==null || str.length()<1)
	return 0;
	int i=0,res=0;
	if(str.charAt(0)=='+' || str.charAt(0)=='-')
	i=1;
	
	for(;i<str.length();i++){
	    if(str.charAt(i)>='0' && str.charAt(i)<='9')
	    res=res*10+(str.charAt(i)-'0');
	    else
	    return -1;
	}
	if(str.charAt(0)=='-')
	res=-res;
	
	return res;
    }
}
