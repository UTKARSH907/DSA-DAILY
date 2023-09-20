//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] nums, int K) {
        // code here
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                
                int k=j+1;
                int l=n-1;
                while(k<l){
                    ArrayList<Integer> al=new ArrayList<>();
                    
                    long sum=(long)nums[i]+(long)nums[j];
                    sum+=(long)nums[k];
                    sum+=(long)nums[l];
                    
                    if(sum==K){
                        al.add(nums[i]); al.add(nums[j]); al.add(nums[k]); al.add(nums[l]);
                        ans.add(al);
                        k++;l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }else if(sum<K){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
       return ans; 
        
    }
}