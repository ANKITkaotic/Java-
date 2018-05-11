import java.util.Scanner;
public class XO {
  public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String str = sc.next();
	int l = str.length();
	char ch[] = new char[l];
	char a ='x';
	char b = 'o';
	char c = 'X';
	char d = 'O';
	for(int i = 0;i < l;i++)
	{
		ch[i] = str.charAt(i);
	}
	int count1 =0;
	int count2 = 0;
	for(int i = 0;i < l;i++)
	{
		if(ch[i] == a || ch[i] == c)
			count1++;
		else if(ch[i] == b || ch[i] == d)
			count2++;
	}
	if(count1 == count2)
		System.out.println("True");
	else
		System.out.println("False");
	    
  }
}
