import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be checked");
		String s = sc.next();
		int l = s.length();
		int n = l-1;
		
		char arr[] = new char[l];
		
		for(int i= 0;i < l;i++)
		{
			arr[i] = s.charAt(i);
		}
		
		int a = 0;
		int flag = 1;
		while(a < n)
		{
			if(arr[a] != arr[n])
			{
				flag = 0;
				break;
			}
			a += 1;
			n -= 1;
		}
		if(flag == 1)
			System.out.println("The string " +s+ " is a palindrome");
		else
			System.out.println("The string " +s+ " is not a palindrome");
		
			
	}
}
			
	
