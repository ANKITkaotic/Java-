import java.util.Scanner;
class search
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int t = sc.nextInt();
		for(int a = 0;a < t;a++)
		{
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the number to be searhed");
		int search = sc.nextInt();
		int count = 0;
		for(int j = 0;j < n;j++)
		{
			if(arr[j] == search)
				count++;
		}
		if(count > 0)
			System.out.println("1");
		else
			System.out.println("0");
		}
	}
}
			
		
