class S1 
{
	public static void main(String[] args) 
	{
		int num = 12345678;
		int num1 =  num ;
		int count = 0;

		while(num1 != 0)
		{
			num1 = num1/10 ;
			count++;
		}
int fact = 1;
		for(int i = 1 ; i <= count/2 ; i++)
		{
			fact = fact*10 ;
		}

		int num2  = num %fact ;
		int num3 = num/fact ;
		System.out.println(count);
		System.out.println(fact);

		System.out.println(num2);
		System.out.println(num3);

		int numRev = num3 ;

		while(num3 


	}
}
