class ABC 
{
	public static void main(String[] args) 
	{
		XYZ a1 = new XYZ();
		System.out.println("Hello World!");
	}
}
class XYZ extends ABC
{
	public static void main(String[] args) 
	{
	ABC a1  = new ABC() ;
	}
}