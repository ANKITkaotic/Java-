import java.util.Scanner;
class insert
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number to be inserted");
		int ins = sc.nextInt();
		System.out.println("Enter the position");
		int pos = sc.nextInt();
		for(int i = n-1; i > pos;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[pos] = ins;
		
		for(int i = 0;i < n;i++)
		{
			System.out.println(arr[i]);
		} 
		
	}
}
			
