
import java.util.Scanner;
class QS1 
{
	public static void main(String[] args) 
	{

		System.out.println("enter on line");
		Scanner sc = new Scanner(System.in);
	String 	s1 = sc.nextLine();
    int i = s1.indexOf(" ");
	System.out.println(s1);
	System.out.println(i);
	String s2 = "" ;
int startIndex = 0;
     while (i != -1)
     {
		 s2 = s1.substring(startIndex ,i) ;
		 System.out.println(s2);
		 startIndex =  i+1  ;
		 i = s1.indexOf(" ",i+1);
	 }
        s2 = s1.substring(startIndex);
	   System.out.println(s2);

	}
}
