class createll
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
	
	public void push(int new_data)
	{
		Node new_node  = new Node(new_data);
		new_node.next = head;
		head = new_node;
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
		createll llist = new createll();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
		llist.printLL();
		System.out.println("After adding");
		llist.push(157);
		llist.printLL();
	}
}
