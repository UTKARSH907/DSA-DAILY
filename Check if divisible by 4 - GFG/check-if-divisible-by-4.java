//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();

    		System.out.println (new Sol().divisibleBy4 (s));
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int divisibleBy4 (String N)
    {
        // Your Code Here
        int num=0;
        int x=0;
        for(int i=0;i<N.length();i++){
            num=num*10+(N.charAt(i)-'0');
            x=num%4;
        }
        // System.out.println(x);
        return (x==0) ? 1 : 0;
    }
}