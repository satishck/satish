import java.util.Arrays ;

//sorting odd elements
class BubbleSort3 
{
	public static void main(String[] args) 
	{
		int [] array = { 4,2,8,10,3,6 ,21,8 ,12,19};
		           //    0 1 2  3  4 5  6  7  8  9
		int temp;
        System.out.println(Arrays.toString(array));
		for(int i = 0 ; i < array.length ; i++)
		{
			for (int j = i+1 ; j < array.length ; j++ )

			{
				if(array[i]%2 == 1 && array[j]%2 == 1 )
				{

					if(array[i] > array [j] )
				{
					temp = array[i];
					array[i] = array [j];
					array[j] = temp;
				}

				}

			}
		}
		System.out.println(Arrays.toString(array));
	}
}
