import java.util.Scanner;
class missing_no
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum = 0;
		
		for(int i = 0;i < t;i++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int j = 0;j < n-1;j++)
			{
				arr[j] = sc.nextInt();
				sum = sum + arr[j];
			}
			int sum2 = (n * (n + 1)) / 2;
			int miss = sum2 - sum;
			
			System.out.println(miss);
		}
	}
}

