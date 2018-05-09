import java.util.Scanner;
class bit_check
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count;
		for(int j = 0;j < n;j++)
		{
			
			int a= sc.nextInt();
			count = 0;
			for(int i = 1;i<= a;i++)
			{
			
			
				int x = a / i;
				if(x <= i)
				{
					count++;
				}
			 
		
			}
			System.out.println(count);
		}
	}
}
