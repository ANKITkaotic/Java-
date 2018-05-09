import java.util.Scanner;
class birthday
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, b;
		for(int i = 0;i < n;i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(b % a == 0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}	
	}
}
		
