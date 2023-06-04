//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/


class Solution
{
    public static Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static Node addOne(Node head) 
    { 
        //code here.
       
       head=reverse(head);
       int sum,carry=1;
       Node temp=null;
       Node cHead=head;
       
       while(cHead!=null){
           sum=carry + cHead.data;
           
           carry= (sum==10)?1:0;
           
           sum=sum%10;
           
           cHead.data=sum;
           
           temp=cHead;
           
           cHead=cHead.next;
       }
       if(carry>0){
           Node newNode=new Node(carry);
           temp.next=newNode;
       }
       
       return reverse(head);
    }
}
