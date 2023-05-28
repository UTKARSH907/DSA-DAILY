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
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
        
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<N;i++){
            String newstr="";
            String str=Dictionary[i];
            int strlen=str.length();
            for(int j=0;j<strlen;j++){
                char ch = str.charAt(j);
                if(ch>='A' && ch<='Z'){
                    newstr+=ch;
                }
            }
            if(newstr.indexOf(Pattern)==0){
               al.add(str);
            //   System.out.println(al);
            }
        }
        Collections.sort(al);
        if(al.size()==0){
            al.add("-1");
            return al;
        }else{
            return al;
        }
    }
}