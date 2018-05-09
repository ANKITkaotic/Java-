import java.util.Scanner;
class pos_count
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int sum = 0;
		for(int i = 0;i < n;i++)
		{
			if(arr[i] > 0)
				count++;
			else if(arr[i] < 0)
				sum = sum + arr[i];
		}
		
		int narr[] = new int[2];
		narr[0] = count;
		narr[1] = sum;
		
		for(int i = 0;i < 2;i++)
		{
			System.out.println(narr[i]);
		} 
	}
	
}
			
		
	

