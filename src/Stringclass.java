
import java.lang.StringBuffer;
class Stringclass 
{
	public static void main(String[] args) 
	{
		/*
		String s1 = "abc" ;
        System.out.println(s1);
		s1.concat("xyz");
		System.out.println(s1);
		
	 s1 = "abc" ;
         System.out.println(s1);
		s1 = s1.concat("xyz");
		System.out.println(s1);
		*/
		String s1 = "java" ;
		String s2 = "ja".concat("va");
		System.out.println(s1 == s2);

		StringBuffer sb = new StringBufffer();
		sb.append("abc");
		sb.append("xyz");
		sb.append("test");
		sb.append("java");
		System.out.println(sb);
		



	}
}
