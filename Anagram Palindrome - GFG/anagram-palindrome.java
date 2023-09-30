//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
		    String s = in.next();
		    if (new Sol().isPossible (s) == 1)
		        System.out.println ("Yes");
		    else
		        System.out.println ("No");
		}
	}
}

// Contributed By: Pranay Bansal


// } Driver Code Ends


class Sol
{
    int isPossible (String S)
    {
        // your code here
        int freq[]=new int[26];
        
        for(char ch: S.toCharArray()){
            freq[ch-'a']++;
        }
       int countodd=0;
        for(int i=0;i<26;i++){
                      if(freq[i]%2!=0){
                          countodd++;
                      }
                  }
              
              if(countodd==1 || countodd==0)
              {
            	  return 1;
              }else {
            	  return 0;
              }
       
    }
}