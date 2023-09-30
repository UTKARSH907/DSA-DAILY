//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    
		    System.out.println(printNumber(s,s.length()));
		}
		
	}

// } Driver Code Ends
//User function Template for Java


//Function to find matching decimal representation of a string as on the keypad.
public static String printNumber(String s, int n) 
{
    //Your code here
    String Str="";
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
    
    if(ch=='a' || ch=='b' || ch=='c'){
        Str+="2";
    }else if(ch=='d' || ch=='e' || ch=='f'){
        Str+="3";
    }else if(ch=='g' || ch=='h' || ch=='i'){
        Str+="4";
    }else if(ch=='j' || ch=='k' || ch=='l'){
        Str+="5";
    }else if(ch=='m' || ch=='n' || ch=='o'){
        Str+="6";
    }else if(ch=='p' || ch=='q' || ch=='r' || ch=='s'){
        Str+="7";
    }else if(ch=='t' || ch=='u' || ch=='v'){
        Str+="8";
    }else if(ch=='w' || ch=='x' || ch=='y' || ch=='z'){
        Str+="9";
    }
        
        
    }
    return Str;
}

//{ Driver Code Starts.

}

// } Driver Code Ends