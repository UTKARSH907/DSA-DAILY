//{ Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}




// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    // reversing a list from mid
    public Node reverseList(Node head){
       if(head==null || head.next==null){
            return head;
        }
        Node newhead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }

// finding middle
    public Node findMid(Node head){
       
        Node turtle=head;
        Node rabbit=head;
        while(rabbit.next!=null && rabbit.next.next!=null){
            turtle=turtle.next;
            rabbit=rabbit.next.next;
        }
        return turtle;
    }
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head==null||head.next==null){
            return true;
        }
        Node curHead=head;
        Node middle=findMid(curHead);
        Node secHead=reverseList(middle.next);

        while(secHead!=null){
            if(curHead.data!=secHead.data){
                return false;
            }
            secHead=secHead.next;
            curHead=curHead.next;
        }
        return true;
    }    
}

