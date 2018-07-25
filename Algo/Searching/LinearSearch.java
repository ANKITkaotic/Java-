import java.util.Scanner;
class LinearSearch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter number to be searched");
		int num = sc.nextInt();
		int flag = 0;
		for(int i = 0;i < n;i++)
		{
			if(arr[i] == num)
			{
				System.out.println("Number " +num+ " is at index "+i);
				flag = 1;
			}
		}
		if(flag == 0)
			System.out.println("Number is not present");
	}
}
		
