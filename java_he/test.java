import java.util.Scanner;
class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int n = sc.nextInt();
		for(int i = 0;i < n;i++)
		{
			
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int l1 = s1.length();
		int l2 = s2.length();
		char c1[] = new char[l1];
		char c2[] = new char[l2];
		
		for(int i =0;i < l1;i++)
			{
				c1[i] = s1.charAt(i);
			}
		for(int i =0;i < l1;i++)
		{
			System.out.println(c1[i]);
		}
		
		for(int i =0;i < l2;i++)
			{
				c2[i] = s2.charAt(i);
			}
		for(int i =0;i < l2;i++)
		{
			System.out.println(c2[i]);
		}
	}
}
