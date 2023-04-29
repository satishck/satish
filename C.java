class H
{
 int i =8;
H()
{
System.out.println("H() begin:" + this.i);
i += 2;
test1();
System.out.println("H() end:" + i);
}
void test1()
{
System.out.println("test1 begin:" + this.i);
i += 3;
https://lara.co.in/

test2();
System.out.println("test1 end:" + i);
}
void test2()
{
System.out.println("test2 begin:" + i);
i += 4;
System.out.println("test2 end:" + i);
}
public static void main(String[] args)
{
System.out.println("main begin");
H h1 = new H();
System.out.println("main1: " + h1.i);
h1.test1();
System.out.println("main2: " + h1.i);
h1.test2();
System.out.println("main3: " + h1.i);
System.out.println("main end");
}

}