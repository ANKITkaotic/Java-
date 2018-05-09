class Student
{
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}
public class Arr_obj
{
	public static void main(String args[])
	{
		Student arr[];
		arr = new Student[4];
		arr[0] = new Student(1, "ankit");
		arr[1] = new Student(2, "sud");
		arr[2] = new Student(3, "sam");
		arr[3] = new Student(4, "sat");
		
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println("Element at index " +i+ " is: " +arr[i].roll_no +" "+arr[i].name);
		}
	}
}
		
