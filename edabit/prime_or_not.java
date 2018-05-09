import java.util.Scanner;
class prime_or_not
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int count = 0;
		if(n == 1)
			System.out.println("False");
		for(int i = 2;i <= n;i++)
		{
			if(n % i == 0)
				count ++;
		}
		if(count == 1)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
