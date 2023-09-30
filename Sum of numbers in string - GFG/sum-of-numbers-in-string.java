//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    }
		
	}
}

// } Driver Code Ends




class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        long sum=0;
        int num=0;
        
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9'){
                num=(num*10)+(ch-'0');
            }else{
                sum=sum+(long)num;
                num=0;
            }
        }
        return sum+(long)num;
    }
    
}