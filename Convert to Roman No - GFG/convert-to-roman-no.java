//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution ob = new Solution();
			System.out.println(ob.convertToRoman(N));
			t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
	String convertToRoman(int n) {
		//code here
		String ans="";
		int num[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String roman[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		int i=num.length-1;
		while(n!=0){
		    
		    int divisor=num[i];
		    int quotient=n/divisor;
		    n=n%divisor;
		    while(quotient-->0){
		        ans+=roman[i];
		    }
		    i--;
		}
		return ans;
	}
}