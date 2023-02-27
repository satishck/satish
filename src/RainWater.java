import java.util.Arrays;
class RainWater 
{
	public static void main(String[] args) 
	{
		int[] heights ={ 2,1,4,0,3,0,1,2,0,3,0,2} ;
		int[] leftMaxvalues = new int[heights.length];
		leftMaxvalues[0] = heights[0];

		for(int i = 1 ; i < heights.length ;i++)
		{
			if(leftMaxvalues[i -1] > heights[i]) 
			{
				leftMaxvalues[i] = leftMaxvalues[i-1] ;
				
			}
			else
			{
				leftMaxvalues[i] = heights[i];
			}
        }
         int[] rightMaxvalues = new int[heights.length];
		rightMaxvalues[heights.length-1] = heights[heights.length-1];

		for(int i = heights.length -2  ; i >= 0 ;i--)
		{
			if(rightMaxvalues[i + 1] < heights[i]) 
			{
				rightMaxvalues[i] = rightMaxvalues[i+1] ;
				
			}
			else
			{
				rightMaxvalues[i] = heights[i];
			}
        }
		System.out.println(Arrays.toString(rightMaxvalues));
		int capacity = 0 ,leftMax,rightMax,minMax,current;
		for(int i = 1 ; i < heights.length-1 ; i++)
		{
			leftMax = leftMaxvalues[i] ;
			rightMax = leftMaxvalues[i] ;
			minMax = leftMax < rightMax ? leftMax : rightMax;
			current = heights[i] ;
			if(current < minMax)
			{
				capacity += (minMax -current);

			}

		}

    System.out.println(capacity);

	}
}
