class Printll
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
	public void printList()
	{
		Node n = head;
		
		while(n != null)
		{
			System.out.println(n.data+" ");
			n = n.next;
		}
	}
	
	public static void main(String args[])
	{
		Printll llist = new Printll();
		llist.head = new Node(7);
		Node second = new Node(2);
		Node third = new Node(4);
		
		llist.head.next = second;
		second.next = third;
		
		llist.printList();
	}
}
