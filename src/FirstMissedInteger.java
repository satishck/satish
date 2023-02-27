class MissingFirstInteger
{
	public static void main(String[] args) 
	{
		int []array = { 1, 3,5,2};

		for(int i = 0 ; i < array.length; i++)
		{
			if( array[i] < 0)
			{
				array[i] = 0 ;
			}
		}
		for(int i = 0 ; i < array.length ; i++)
		{
			if(array[i] <= array.length)
			{
				array[array[i]-1] = -1 ;
			}
		}
		for (int i = 0 ;i < array.length ; i++ )
        {
			if (array[i] > 0)
			{
				System.out.println("missed element in array is " + (i+1) );
				break;
			}
		}
		
	}
}
