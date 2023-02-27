import java.util.Arrays ;

//sorting odd indexed elements
class BubbleSort5 
{
	public static void main(String[] args) 
	{
		int [] array = { 4,2,8,10,3,6 ,21,8 ,12,19};
		           //    0 1 2  3  4 5  6  7  8  9
		int temp;
        System.out.println(Arrays.toString(array));
		for(int i = 1 ; i < array.length ; i+=2)
		{
			for (int j = i+2 ; j < array.length ; j+=2 )

			{
				
				

					if(array[i] > array [j] )
				{
					temp = array[i];
					array[i] = array [j];
					array[j] = temp;
				}

				

			}
		}
		System.out.println(Arrays.toString(array));
	}
}
