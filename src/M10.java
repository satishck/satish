import java.util.Arrays;
class  M10
{
	public static void main(String[] args) 
	{
		String s1 = "hello" ;
		 //          012345  
		System.out.println(s1);
		char[] chars = s1.toCharArray();
		char c1;
		for( int i =chars.length-1 ; i >=  0 ; i--)
		{
			 c1 = chars[i];
			System.out.println(c1);
		}
		System.out.println(Arrays.toString(chars));
	}
}

