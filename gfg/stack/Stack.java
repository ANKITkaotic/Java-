import java.util.Scanner;
class Stack
{
	static final int max = 100;
	int a[] = new int[max];
	int top;
	int x;
	Stack()
	{
		top = -1;
	}
	
	boolean push(int x)
	{
		if(top >= (max-1))
		{
			System.out.println("Overflow");
			return false;
		}
		else
		{
			a[++top] = x;
			return true;
		}
	}
	
	int pop()
	{
		if(top < 0)
			System.out.println("Underflow");
			
		else
			x = a[top--];
		return x;
	} 
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Stack a = new Stack();
		a.push(2);
		a.push(1);
		a.push(5);
		a.push(7);
		
		System.out.println(a.pop()+ " is popped out");
	}
}
