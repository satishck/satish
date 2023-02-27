
import java.util.Arrays ;
class BubbleSort 
{
	public static void main(String[] args) 
	{
		int [] array = { 4,2,8,10,16,6,21,8 ,12};
		int temp;

		for(int i = 0 ; i < array.length ; i++)
		{
			for (int j = 0 ; j < array.length-1-i ; j++ )

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

/**
	int [] array = { 4,2,8,10,16,6,21,8 ,12};
                     0 1 2 3   4 5 6  7  8
	i = 0                        i = 1
	j = 0                        j = 0
------------                       
 4 is greater than 2         
 { 2,4,8,10,.----}            {2,4,8,10,6,16,8,12,21}
                            -----------------------------
------------------
 i = 0 
 j = 1
 -----------
 4 is lesser than 8
 so it remains same
 ----------------
 i = 0 
 j = 2
 ----------
 8 is lesser than 10 
 so it remains same
 ----------------
 i = 0 
 j = 3
-------------
10 is less than 16
no swapping
---------
i = 0 
j = 4
-----------
16 is grater than 6
so swapping occurs
{2,4,8,10,6,16,21,8,12}
--------------
i = 0
j= 5
16 is lesser than 21
{2,4,8,10,6,16,21,8,12}
-------------------------
i = 0
j= 6
21 is greater than 8
{2,4,8,10,6,16,8,21,12}
-------------------------
i = 0
j= 7
21 is greater than 12
{2,4,8,10,6,16,8,12,21}
-------------------------





*/