
import java.util.Arrays;
class BinarySearch1 
{
	public static void main(String[] args) 
	{
		int []data = {2,5,7,12,15};
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
