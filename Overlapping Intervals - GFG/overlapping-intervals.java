//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public static class Pair implements Comparable<Pair>{
    int st;int ed;
    Pair(int st,int ed){
        this.st=st;
        this.ed=ed;
    }
    
    public int compareTo(Pair other){
        if(this.st != other.st){
            return this.st - other.st;
        }else{
            return this.ed - other.ed;
        }
    }
}
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here
        Pair pair[]=new Pair[Intervals.length];
        for(int i=0;i<Intervals.length;i++){
            pair[i]=new Pair(Intervals[i][0],Intervals[i][1]);
        
        }
        Arrays.sort(pair);
        Stack<Pair> s=new Stack<>();
        for(int i=0;i<pair.length;i++){
            if(i==0){
                s.push(pair[i]);
            }else{
                Pair top=s.peek();
                if(pair[i].st > top.ed){
                    s.push(pair[i]);
                }else{
                    top.ed=Math.max(top.ed,pair[i].ed);
                }
            }
        }
        
        Stack<Pair> sst=new Stack<>();
        while(s.size()>0){
            sst.push(s.pop());
            // System.out.println(p.st+" "+p.ed);
        }
        // System.out.println(s.size());
       int res[][]=new int[sst.size()][2];
       int l=sst.size();
      for(int i=0;i<l;i++){
          Pair p=sst.pop();
          res[i][0]=(int)p.st;
          res[i][1]=(int)p.ed;
      }
       return res;
   
}
}