import java.util.Scanner;
class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter the string");
		s = sc.next();
		int l = s.length();
		char ch[] = new char[l];
		for(int i = 0;i < l;i++)
		{
			ch[i] = s.charAt(i);
		}
		int count1 = 0;
		int count2 = 0;
		for(int i = 0;i < l;i++)
		{
			int a = (int)ch[i];
			int b = (int)ch[i];
			
			if(a == 111)
				count1++;
			else if(b == 120)
				count2++;
		}
		if(count1 == count2)
			System.out.println("True");
		else
			System.out.println("False");
		
	}
	
}
		
		
