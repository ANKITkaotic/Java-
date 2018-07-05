import java.util.Scanner;
class Delete_key
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		public Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public void delete(int key)
	{
		
		Node temp = head, prev = null;
		
		if(temp != null && temp.data == key)
		{
			head = temp.next;
		}
		
		while(temp != null && temp.data != key)
		{
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null && temp.data != key)
			System.out.println("Number is not in the list");
		
		prev.next = temp.next;
	}
	
	public void printList()
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		Delete_key llist = new Delete_key();
		llist.head = new Node(1);
		Node second  = new Node(5);
		Node third = new Node(7);
		
		llist.head.next = second;
		second.next = third;
		System.out.println("Enter the number to be deleted");
		int n = sc.nextInt();
		llist.delete(n);
		llist.printList();
	}
}
		 
