class Geek{
	String name;
	int num;
	public Geek()
	{
		System.out.println("Called");
	}
	public Geek(String nam,int n)
	{
		this.name = nam;
		this.num = n;
	}
	
	
	public static void main(String args[])
	{
		Geek obj = new Geek("Ankit",7);
		System.out.println("Geekname is " +obj.name+" and id is "+obj.num);
	}
}
