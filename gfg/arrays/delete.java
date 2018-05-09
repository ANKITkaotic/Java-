import java.util.Scanner;
class delete
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number to be deleted");
		int del= sc.nextInt();
		int indx_del=-1;
		for(int i =0;i < n;i++)
		{
			if(arr[i] == del)
				indx_del = i;
			else
				System.out.println("number to be deleted not present in array");
		}
		
		for(int i =indx_del+1;i < n;i++)
		{
			arr[i-1] = arr[i];
		}
		
		for(int i = 0;i < n-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
