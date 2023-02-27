class  M16
{
	public static void main(String[] args) 
	{
		char[] chars = { 'a' , 'b' ,' ', 'd'} ;
		String s2 = new String(chars) ;

		String s1 = "java is better than apple ";



       int i = s1.indexOf('a');
      while(i != -1)
		{
		  
		  System.out.println(s2);
		  i = s1.indexOf('a' , i + 1);
		}
		String a1 = "java";
		String a2 = "ja";
		String a3 = "va";
		String a4 = "ja" + a3 ;
		String a5 = a2 +"va" ;
		String a6 = a2 + a3 ;

		System.out.println(a1==a4);
		System.out.println(a1==a5);
		System.out.println(a1==a6);
		System.out.println(a4==a5);
		System.out.println(a4==a6);
		System.out.println(a5==a6);

/*
		String a1 = "java";
		String a2 = "ja";
		String a3 = "va";
		String a4 = "ja" + a3 ;
		String a5 = a2 +"va" ;
		String a6 = a2 + a3 ;

		System.out.println(a1==a4);
		System.out.println(a1==a5);
		System.out.println(a1==a6);
		System.out.println(a4==a5);
		System.out.println(a4==a6);
		System.out.println(a5==a6);
*/

	}
}
