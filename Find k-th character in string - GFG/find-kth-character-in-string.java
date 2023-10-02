//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);
            Solution ob = new Solution();
            System.out.println(ob.kthCharacter(m,n,k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    char kthCharacter(int m, int n, int k) {
        // code here
        int temp=m;
        String str="";
        while(m!=0){
            int rem=m%2;
            str=str+rem+"";
            m=m/2;
        }
        
        String binRepr="";
        for(int i=str.length()-1;i>=0;i--){
            binRepr+=str.charAt(i);
        }
        if(temp==0) binRepr="0";
        
        // System.out.println(binRepr);
        StringBuilder sb=new StringBuilder(binRepr);
        
        while(n-->0){
            // int l=sb.length();
           StringBuilder ans=new StringBuilder();
           for(int i=0;i<sb.length();i++){
               if(sb.charAt(i)=='0') ans.append("01");
               else ans.append("10");
           }
        //   System.out.println(sb);
           sb=ans;
        }
    //   System.out.println(sb);
      return sb.charAt(k-1);
    }
}