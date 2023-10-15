//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String str = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine().trim());
            Solution obj = new Solution();
            if(obj.kPangram(str, k))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean kPangram(String str, int k) 
    {
        // code here
       
        int len=0;
        int a[]=new int[26];
        for(char ch:str.toCharArray()){
            if(ch==' ') continue;
            a[ch-'a']++;
            len++;
        }
         if(len<26){
            return false;
        }
        int missing=0;
        for(int ele:a){
            if(ele==0) missing++;
        }
        return (missing<=k) ? true : false;
    }
}