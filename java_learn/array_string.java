import java.util.Scanner;
class array_string
{
	public static void main(String args[])
	{
		String s1[] = new String[3];
		s1[0] = "Hello";
		s1[1] = "Kuchu";
		
		System.out.println(s1[1]);
		
		String s2[] = {"again", "back", "with", "bang"};
		
		for(String fruit:s2)
		{
			System.out.println(fruit);
		}
		
	}
}

