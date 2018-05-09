class clone_arr
{
	public static void main(String args[])
	{
		int arr[] = {1, 2, 3, 4};
		int clarr[] = arr.clone();
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println(clarr[i]);
		}
	}
}
