public class Arthematicoperation
{
public void meth1()
{
	int a=20;
	int b=30;
	int c=a+b;
    System.out.println("Addition : " +c);
}  

public void meth2()
{
	int a=50;
	int b=40;
	int c=a-b;
	System.out.println("sub : "+c);
}
public void meth3()
{
	int a=60;
	int b=80;
	int c=a*b;
	System.out.println("div : "+c);
	
}
public static void main(String[]args)
{
	Arthematicoperation obj=new Arthematicoperation();
	obj.meth1();
	obj.meth2();
    obj.meth3();
}
}