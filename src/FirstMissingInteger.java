import java.util.Arrays ;
class FirstMissingInteger
{
	public static void main(String[] args) 
	{
		int []array = { 1, 2,3,5};

		for(int i = 0 ; i < array.length; i++)
		{
			if( array[i] < 0)
			{
				array[i] = 0 ;
			}
		}
		int temp ;
		for(int i = 0 ; i < array.length ; i++)
		{
			if(array.length >= array[i] && array[i] > 0)
			{
				array[array[i] -1] = -1 ;
			}
		}
		System.out.println(Arrays.toString(array));
		boolean b1 = true ;
		for (int i = 0 ;i < array.length ; i++ )
        {
			if (array[i] > 0)
			{
				System.out.println("first missed number in array is " + (i+1) );
				 b1 = false ; 
				break;
			}
			
		}

      if(b1)
		{
		  		
				System.out.println("no number is missed");
		}

		
	}
}
