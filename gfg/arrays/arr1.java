import java.util.Scanner;
class arr1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[5];
		ar[0] = 1;
		ar[1] = 2;
		ar[2] = 3;
		ar[3] = 4;
		ar[4] = 5;
		
		for(int i = 0;i < ar.length;i++)
		{
			System.out.println("The array at index " +i+ " is: " +ar[i]);
		}
	}
}
