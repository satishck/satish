class  M15
{
	public static void main(String[] args) 
	{
		char[] chars = { 'a' , 'b' ,'c', 'd'} ;

		String s1 = "java     is be tter than apple ";

		for (int i = s1.indexOf(' ');i != -1 ;i =s1.indexOf(' ',i+1) )

		{
			System.out.println(i);
		}
	}
}
