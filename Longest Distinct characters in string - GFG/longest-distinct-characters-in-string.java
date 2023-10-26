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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
       HashMap<Character,Integer> map =new HashMap<>();
       int len=0,n=S.length();
       int left=0,right=0;
       
       while(right<n){
           if(map.containsKey(S.charAt(right)))
             left=Math.max(map.get(S.charAt(right))+1, left);
           
           map.put(S.charAt(right),right);
           len=Math.max(len , right-left+1);
           right++;
       }
       return len;
    }
}