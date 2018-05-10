import java.util.Scanner;
class repeat_letters
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		int l = s.length();
		int mod;
		char arr[] = new char[l*2];
		System.out.println(l);
		for(int i = 0;i < l-1;i=i+2)
		{
			if(i % 2 == 0)
				arr[i] = s.charAt(i);
			else if(i > 0 && i % 2 != 0)
			{
				arr[i] = s.charAt(i-1);
				arr[i+1] = s.charAt(i);
			}
		}
		
		for(int i =0;i < l;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
		
