
import java.util.Arrays ;

//sorting Even elements
class BubbleSort4 
{

public static void main(String[] args) {
	int [] a1= {1,2,6,8,5,77, 81,89,7,9,4,15};
	System.out.println("initial :"+ Arrays.toString(a1));
	int temp=0;
	for(int i = 0;i<a1.length;i++)
	{
     for(int j = i+1;j<a1.length;j++)
	    {
    	 if(a1[i]%2==0&&a1[j]%2==0)
    	 {
    		 if(a1[i]>a1[j])
    		 {
    			 temp=a1[i];
    			 a1[i]=a1[j];
    			 a1[j]=temp;
    		 }
    	 }
	    }
	}
	System.out.println("final :"+ Arrays.toString(a1));	
}
}