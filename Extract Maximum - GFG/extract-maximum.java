//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.extractMaximum(S)); 
            t--;
        }
    } 
} 



// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int extractMaximum(String S) 
    { 
        // code here
        int max=-1;
        int num=0;
        for(int i=0;i<S.length();i++){
            char ch= S.charAt(i);
            if(ch>='0' && ch<='9'){
                num=(num*10)+(ch-'0');
                max=Math.max(max,num);
            }else{
                    num=0;
            }
        }
        return max;
        
    }    
} 
