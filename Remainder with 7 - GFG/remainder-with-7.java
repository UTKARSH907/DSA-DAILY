//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			Solution obj = new Solution();
			System.out.println(obj.remainderWith7(str));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    // Complete the function
    int remainderWith7(String num)
    {
        // Your code here
        int x=0;
        for(int i=0;i<num.length();i++){
            int temp=num.charAt(i)-'0';
            x=x*10+temp;
            x=x%7;
        }
        return x;
    }
}
