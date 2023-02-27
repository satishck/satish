
import java.util.Arrays;
class BinarySearch 
{
	public static void main(String[] args) 
	{
		int []data = {10 , 2 , 15 , 1, 14 , 4 ,8 , 18 , 9 , 11};
		System.out.println(Arrays.toString(data));
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));

		int left = 0 , right = data.length-1 ,mid , midElement,searchElement = 1 ;

		while(left <= right)
		{
			mid = left +((right - left)/2);
			midElement = data[mid] ;

			if(midElement == searchElement)
			{
				System.out.println(searchElement + " is available at " + mid);
				break;
			}
			if(midElement > searchElement)
			{
				right = mid - 1 ;
			}
			else
			{
				left = mid + 1;
			}
		}


	}
}
