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
            
            String a = sc.next();
            String b = sc.next();
            Solution ob = new Solution();
            if(ob.isSubSequence(a,b))
            System.out.println(1);
            else
            System.out.println(0);
 		
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    boolean isSubSequence(String A, String B){
        int n1=A.length();
        int n2=B.length();
        int i=0,j=0;
        
        while(i<n1 && j<n2){
            if(A.charAt(i)==B.charAt(j)){
                i++;j++;
            }else{
                j++;
            }
        }
        return (i==n1) ? true : false;
    }
}