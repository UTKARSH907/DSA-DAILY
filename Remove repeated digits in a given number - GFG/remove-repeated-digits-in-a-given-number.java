//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long num = Long.parseLong(read.readLine()); 
            Solution ob = new Solution();
            System.out.println(ob.modify(num));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long modify(long N)
    {
        //code here
        Stack<Long> st=new Stack<Long>();
        long temp=N;
        while(temp!=0){
            long a=temp%10;
            if(st.size()==0 || st.peek()!=a){
                st.push(a);
            }
            temp=temp/10;
        }
        // System.out.println(st.size());
        String str="";
        while(st.size()!=0){
            str=str+st.pop();
        }
        return Long.valueOf(str);
        
    }
}