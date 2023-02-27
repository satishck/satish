import java.util.Arrays ;
import java.util.Scanner ;
class  CompleteString
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		 int i = s1.length();
		System.out.println(i);
		char c1 = s1.charAt(0);
		System.out.println(c1);

		String s2 = "    hello how 234 are you" ;
		String firstWord = s2.substring(0 , s2.indexOf(' '));
		String s3 = s2.substring(s2.indexOf(' ')+1 ) + " " +firstWord ;
		System.out.println(s3);
		System.out.println(s2);

Scanner sc = new Scanner(System.in);
 String s5 = sc.nextLine();
 s5 = s5.trim();
		String [] words = s5.split("\\s+");
		int wordsCount = words.length;
		System.out.println(wordsCount);

		System.out.println(Arrays.toString(words));

	}
}
