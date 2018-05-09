import java.util.Scanner;
class twostrings
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string");
		String s1 = sc.next();
		System.out.println("Enter the second string");
		String s2 = sc.next();
		int l1 = s1.length();
		int l2 = s2.length();
		int flag = 0;
		int count = 0;
		char ch1[] = new char[l2];
		char ch2[] = new char[l2];
		for(int i = 0;i< (l1-l2)+1;i++)
		{
			ch1[i] = s1.charAt(i);
		}
		//second sting in char
		for(int j = 0;j < l2;j++)
		{
			ch2[j] = s2.charAt(j);
		}
		
		for(int i = 0;i < l2;i++)
		{
			if(ch1[i] == ch2[i])
			{
				count++;
			}
			if(count-1 == i)
				flag = 1;
			 
		}
		if(flag == 1)
			System.out.println("True");
		else
			System.out.print("False");
			
	}
	
}
