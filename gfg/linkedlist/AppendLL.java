import java.util.Scanner;
class AppendLL
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
	
	public void append(int new_data)
	{
		Node new_node = new Node(new_data);
		
		if(head == null)
		{
			head = new Node(new_data);
			return;
		}
		
		new_node.next = null;
		
		Node n = head;
		
		while(n.next != null)
			n = n.next;
		
		n.next = new_node;
		return;
	}
	
	public void printLL()
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
		int num;
		AppendLL llist = new AppendLL();
		do
		{
			System.out.println("Enter the elements");
			int n = sc.nextInt();
			
			llist.append(n);
			
			System.out.println("Do you want to enter more elements");
			num = sc.nextInt();
		}while(num != 0);
		
		llist.printLL();
	}
} 
