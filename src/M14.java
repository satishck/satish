class  M14
{
	public static void main(String[] args) 
	{
		char[] chars = { 'a' , 'b' ,'c', 'd'} ;

		String s1 = "java is better than apple";

		int i = s1.indexOf('a');
		System.out.println(i);
		int j = s1.indexOf('a' , i+1);
		System.out.println(j);
		int k = s1.indexOf('a',j+1);
		System.out.println(k);
		int l = s1.indexOf('a',k+1);
		System.out.println(l);
	}
}
