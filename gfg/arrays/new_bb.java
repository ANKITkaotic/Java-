import java.util.Scanner;
class new_bb
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
		
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
		
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}
		

