//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String s=br.readLine();
		    GfG g=new GfG();
		    int len=g.count(s);
		    System.out.println(len);
		}
	}
}

// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public int count(String s)
    {
        //add code here.
        
       int maxlen=0;
       String str="";
       for(int i=1;;i++){
           str+="1";
           if(s.indexOf(str)<0){
               return str.length()-1;
           }
       }
    }
}