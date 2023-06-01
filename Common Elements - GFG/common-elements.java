//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking total count-1 of elements 
		    int n=sc.nextInt();
		    
		    //Declaring and Initializing an ArrayList-1
		    int v1[]=new int[n];
		    
		    //adding elements to the ArrayList-1
		    for(int i=0;i<n;i++)
		    {
		        v1[i]=sc.nextInt();
		    }
		    
		    //taking total count-2 of elements 
		    int m=sc.nextInt();
		    
		    //Declaring and Initializing an ArrayList-2
		    int v2[]=new int[m];
		    
		    //adding elements to the ArrayList-2
		    for(int i=0;i<m;i++)
		    {
		        v2[i]=sc.nextInt();
		    }
		    Solution ob = new Solution();
		    //calling the method common_element
		    //and passing ArrayList 1, 2 as arguments
		    //and storing the results in a new ArrayList
		    ArrayList<Integer>ans=ob.common_element(v1, v2);
		    
		    //printing the elements of the new ArrayList
		    for(int i:ans)
		    System.out.print(i+" ");
		    
		    System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Your code here
     HashMap<Integer,Integer> map1 =new HashMap<>();
     HashMap<Integer,Integer> map2=new HashMap<>();
    for(int i=0;i<v1.length;i++){
        map1.put(v1[i],map1.getOrDefault(v1[i],0)+1);
    }
    for(int i=0;i<v2.length;i++){
        map2.put(v2[i],map2.getOrDefault(v2[i],0)+1);
    }
    ArrayList<Integer> al=new ArrayList<>();
    for(Integer val:map2.keySet()){
        if(map1.containsKey(val)){
            int a = Math.min(map1.get(val),map2.get(val));
            while(a-->0){
                al.add(val);
            }
        }
    }
    Collections.sort(al);
    return al;
    }
}