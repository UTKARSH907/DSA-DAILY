//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transform (A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transform (String A, String B)
    {
        // code here
        // A=A.toLowerCase();
        // B=B.toLowerCase();
        // System.out.println(A+"  "+B);
        int n=A.length();
        int m=B.length();
        if(n!=m) return -1;
        
        int freq1[]=new int[123];
        int freq2[]=new int[123];
        for(char ch1:A.toCharArray()) freq1[(int)ch1]++;//sum of ascii
        for(char ch2:B.toCharArray()) freq2[(int)ch2]++;
        for(int i=0;i<123;i++) {
            if(freq1[i]!=freq2[i]) return -1;
        }
        // System.out.println(s1+"  "+s2);anod mpad
        
        int i=n-1,j=m-1,count=0;
        while(i>=0 && j>=0){
            if(A.charAt(i)==B.charAt(j)){
                i--;
                j--;
            }else{
                count++;
                i--;
            }
        }
        return count;
    }
}