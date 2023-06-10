//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void Rearrange(int a[], int n)
    {
        // Your code goes here
       Stack<Integer> one=new Stack<>();
       Stack<Integer> two=new Stack<>();
       Stack<Integer> three=new Stack<>();
       int count=0;
       int tottalele=0;
      for(int i=0;i<n;i++){
          if(a[i]<0){
              count++;
          }
          one.push(a[i]);
      }
      if(count==0){
          return;
      }
      while(one.size()>0){
          while(!one.isEmpty() &&one.peek()<0){
              three.push(one.pop());
          }
          if(!one.isEmpty()&&one.peek()>= 0){
              two.push(one.pop());
          }
          
      }
       int sz = three.size();
        // System.out.println(sz);
        for (int i =0; i<sz; i++) {
            a[i] = three.pop();
            // System.out.println(a[i]);
        }
     for (int i = sz; i<n; i++) {
            a[i] = two.pop();
        }
    }
}