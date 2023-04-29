class Recursion 
{
	public static void main(String[] args) 
	{
		int [] a = { 2,3,12,5,6};
		//recursion(5);
		mergeSort(a,0,4);
		
	}
	static void recursion(int i)
	{
		i--;
		if(i>0)
      {
			recursion(i);
			System.out.println(i);
			
	  }
	}
	static void mergeSort(int a[], int beg, int end)  
{  
    if (beg < end)   
    {  
		
        int mid = (beg + end) / 2;  
        mergeSort(a, beg, mid);
		
	    mergeSort(a, mid + 1, end);  
		System.out.println(""+beg + mid+end);
        //merge(a, beg, mid, end);  
		
    }  
}  

}
