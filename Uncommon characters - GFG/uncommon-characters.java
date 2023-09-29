//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<A.length();i++){
            if(B.indexOf(A.charAt(i))<0){
                set.add(A.charAt(i));
            }
        }
        for(int i=0;i<B.length();i++){
            if(A.indexOf(B.charAt(i))<0){
                set.add(B.charAt(i));
            }
        }
        ArrayList<Character> al=new ArrayList<>(set);
        Collections.sort(al);
        String str="";
        for(char ch:al){
            str=str+ch;
        }
        return (str.length()==0) ? "-1" : str ;
    }
}