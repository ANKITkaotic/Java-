import java.util.Scanner;
class mean
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		double sum = 0;
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		sum = sum / n;
		double x = (double)Math.round(sum * 100) / 100;
		System.out.println(x);
	}
}
