import java.util.Scanner;
class GCD
{
	int giveGCD(int x, int y)
	{
		int r;
		while(y != 0)
		{
			r = x % y;
			x = y;
			y = r;
		}
		return x;
	}	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		GCD obj = new GCD();
		int x = obj.giveGCD(a, b);
		System.out.println("The gcd of " +a+ " and " +b+ " is " +x);
	}
} 
