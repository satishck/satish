import java.util.Arrays;
class  M8
{
	public static void main(String[] args) 
	{
		String s1 = "hello" ;
		 //          012345  
		System.out.println(s1);
		char[] chars = s1.toCharArray();
		
		for( char c1 : chars)
		{
			
			System.out.println(c1);
		}
		System.out.println(Arrays.toString(chars));
	}
}
