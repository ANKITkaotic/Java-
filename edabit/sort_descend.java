import java.util.Scanner;
class sort_descend
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int count = 0;
		int num = n;
		int num2 = n;
		while(num != 0)
		{
			num = num / 10;
			count++;
		}
		
		int arr[] = new int[count];
		
		int a = 0;
			while(num2 != 0)
			{
				arr[a] = num2 % 10;
				num2 = num2 / 10;
				
				a++;
			}
		
		
		//Start sorting
		for(int i = 0;i < count;i++)
		{
			
			for(int j = 0;j < count -1;j++)
			{
			
				
				if(arr[j] < arr[j+1])
				{
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				
			
			}
		}
		
		//print final result
		
		
		
		
		int b = 0;
		for(int i = 0;i < count;i++)
		{
			b = (b * 10) + arr[i];
		}
		System.out.println("Value is " +b);
	}
}
		 
	
