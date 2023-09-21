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
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        // int ans[][]=new int[Intervals.length][2];
        java.util.Arrays.sort(Intervals, new java.util.Comparator<int[]>() {
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
});

ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

// for(int i=0;i<Intervals.length;i++){
//     System.out.println(Intervals[i][0]+" "+Intervals[i][1]);
// }
        
        for(int i=0;i<Intervals.length;i++){
            ArrayList<Integer> temp=new ArrayList<>();
        if(i>0){
            temp=ans.get(ans.size()-1);
        }
            
            if(i==0 || Intervals[i][0] > temp.get(1)){
                ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(Intervals[i][0]);
                al.add(Intervals[i][1]);
                ans.add(al);
                // System.out.println(ans);
            }else{
                
                ans.remove(ans.size()-1);
                temp.set(1,Math.max(temp.get(1), Intervals[i][1]));
                ans.add(temp);
            }
        } 
        int t[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            ArrayList<Integer> al=ans.get(i);
            t[i][0]=al.get(0);
            t[i][1]=al.get(1);
            
        }
      return t;  
    }
}