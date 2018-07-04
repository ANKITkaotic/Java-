class LLinsert
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
	
	public void insert_beg(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void insert_end(int new_data)
	{
		Node new_node = new Node(new_data);
		Node n = head;
		while(n.next != null)
		{
			n = n.next;
		}
		n.next = new_node;
		new_node.next = null;
	}
	
	public void insert_any(Node prev_node, int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
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
		LLinsert llist = new LLinsert();
		llist.insert_beg(2);
		llist.insert_end(7);
		llist.insert_any(llist.head,1);
		llist.insert_any(llist.head.next,5);
		llist.printLL();
	}
	
}	
