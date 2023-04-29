class P
{
int i,k;
double j;
P(int i)
{

//this.k= i+10;
//i = this.k;
//this.j= 5.5;
}
P(double j)
{
	this(8);
	i = i;
	this.j= i; 

}
P(int i, double j)
{
this.i = i;
this.j = j;
}
void printObjectState()
{
System.out.println(i + ", " + j+"," +k);
}
public static void main(String[] args)
{
P p1 = new P(10);
System.out.println("---------");
P p2 = new P(1.5);
System.out.println("---------");
P p3 = new P(100, 7.5);
System.out.println("---------");
p1.printObjectState();
p2.printObjectState();
p3.printObjectState();
}
}