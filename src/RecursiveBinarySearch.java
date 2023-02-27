import java.util.Arrays;

class RecursiveBinarySearch 
{
	public static void main(String[] args) 
	{

	int []data = {2,5,7,12,15};
		System.out.println(Arrays.toString(data));
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));

		
        String m =binarySearch( data , 15);
		System.out.println(m);

	}

	static String binarySearch(int [] data,int m)
	{
		int left = 0 , right = data.length-1 ,mid = 0 , midElement,searchElement = m;




		while(left <= right)
		{
			mid = left +((right - left)/2);
			midElement = data[mid] ;

			if(midElement == searchElement)
			{
				//System.out.println(searchElement + " is available at " + mid);
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
		return "searchElement: " +searchElement +"is available at index " + mid ;

	}
	
}
