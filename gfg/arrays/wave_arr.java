import java.util.Scanner;
class wave_arr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int a = 0;a < t;a++)
		{
		int n = sc.nextInt();
		int arr[] = new int[n];
		//input elements
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//sorting starts
		for(int i = 0;i < arr.length;i++)
		{
			for(int j = 0;j < arr.length-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		
		
		
		//sorting ends
		
		for(int i = 1;i < arr.length-2;i += 2)
		{
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		}
			
			
	}
}

