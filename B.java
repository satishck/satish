class B
{
	int i;
	void test1()
{
		i = i;
System.out.println("from test:" + i);
i = i;
}
public static void main(String[] args)
{
B b1 = new B();
System.out.println("from main:" +b1);
B b2 = new B();
b2.i=32;
b2.test1();
}
}
/*
1. whichever reference used to call a non static
method, same reference is acting as a this
inside a same non static method.
https://lara.co.in/
38
2. we can consider this as a current object's
reference
3. this is available only inside a non static
definition blocks.
4. this is available only inside a object members to
refer the current object.
5. this is a reference variable to current object
*/