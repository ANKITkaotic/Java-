import java.util.Scanner;
class same{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int a =0;a < n;a++)
		{				
			String name1 = sc.next();				//Input first string
			int l1 = name1.length();
		
			String name2 = sc.next();				//Input second string
			int l2 = name2.length();
			char c1[] = new char[l1];
			char c2[] = new char[l2];
			int count = 0;
		
			//assinging strings to array of character
		
				for(int i =0;i < l1;i++)
				{
					c1[i] = name1.charAt(i);
				}
			
		
				for(int j = 0;j < l1;j++)
				{
					c2[j] = name2.charAt(j);	
				}
		
			//Checking starts here
			
				for(int i = 0;i < l1;i++)
				{
			
					count = 0;
					for(int j = 0;j < l2;j++)
					{
				
				
						if(c1[i] == c2[j])
						{
							
							count++;
						}
					}
					if(count == 0)
					{
						System.out.println("NO");
						break;
					}
				
				}
				if(count > 0)
				{
					System.out.println("YES");
				}	
		}
	}
	
}
