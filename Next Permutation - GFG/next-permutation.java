//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        
        int ind=-1;
        for(int i=N-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind = i;
                break;
            }
        }
        // System.out.println(ind);
        
        if(ind==-1){
            for(int i=N-1;i>=0;i--){
               al.add(arr[i]);
            }
            return al;
        }
        
        for(int i=N-1;i>ind;i--){
            if(arr[i]>arr[ind]){
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
                break;
            }
        }
        int s=N;
        for(int i=ind+1;i<s;i++){
            int temp=arr[i];
            arr[i]=arr[s-1];
            arr[s-1]=temp;
            s--;
        }
        
        for(int i=0;i<N;i++){
            al.add(arr[i]);
        }
        return al;
    }
}