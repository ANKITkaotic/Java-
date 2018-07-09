import java.util.Scanner;
class selection_sort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i < n-1;i++)
		{
			int min_indx = i;
			for(int j = i+1;j < n;j++)
			{
				if(arr[j] < arr[min_indx])
					min_indx = j;
			}
			int temp = arr[min_indx];
			arr[min_indx] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("After sorting array is ");
		
		for(int i = 0;i < n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
