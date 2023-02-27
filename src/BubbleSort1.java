import java.util.Arrays ;

//sorting first half
class BubbleSort1 
{
	public static void main(String[] args) 
	{
		int [] array = { 4,2,8,10,3,6 ,21,8 ,12,19};
		           //    0 1 2  3  4 5  6  7  8
		int temp;
        System.out.println(Arrays.toString(array));
		for(int i = 0 ; i < array.length/2 ; i++)
		{
			for (int j = 0 ; j < array.length/2-1-i ; j++ )

			{
				if (array[j] > array [j+1])
				{
					temp = array[j];
					array[j] = array [j+1];
					array[j+1] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(array));
	}
}

