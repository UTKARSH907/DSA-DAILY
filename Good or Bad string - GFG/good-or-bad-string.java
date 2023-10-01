//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.isGoodorBad(S));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int isGoodorBad(String S) {
        // code here
        int conso=0;
        int vowe=0;
        int i=0;
        while(i<S.length()){
            char ch=S.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                conso=0;
                vowe++;
                if(vowe>5){
                    return 0;
                }
            }else if(ch=='?'){
                
                conso++;
                vowe++;
                if(conso>3){
                    return 0;
                }
                if(vowe>5){
                    return 0;
                }
                
            }else{
                vowe=0;
                conso++;
                if(conso>3){
                    return 0;
                }
            }
            
            
            i++;
        }
        return 1;
    }
};