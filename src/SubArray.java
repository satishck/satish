import java.util.Arrays ;
class SubArray

{
	public static void main(String[] args) 
	{
		int [] a1 = { 2, 4,6,8,12,21} ;
		int num = 32 ;
		int start = 0;
		int sum = a1[0];

		for( int i = 1 ; i < a1.length ; i++)
		
		{
			sum = sum + a1[i];


			              while(sum > num && i < i-1)
			             {
							  sum = sum - a1[start] ;
							  start++;
						 }
            
			if (sum == num)
			{
				for(int j = start; j <= i ; j++)
				{
					System.out.print(a1[j]);

			}

			}
		//System.out.println("Hello World!");
	}
}
}
