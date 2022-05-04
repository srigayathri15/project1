public class Datatypes
{
int i;
byte b;
short s;
long l;
float f;
double d;
char c;
boolean flag;
void meth1()
{
	System.out.println("printing the default value of the 8PDT");
	System.out.println("int value:"+i);
	System.out.println("byte value"+b);
	System.out.println("short value"+s);
	System.out.println("long value"+l);
	System.out.println("float value"+f);
	System.out.println("double value"+d);
	System.out.println("char value"+c);
	System.out.println("boolean value"+flag);
}
	void meth2()
	{
		byte b1=10;
		byte b2=10;
		byte b3=(byte)(b1+b2);
		float f=10.9f;
		long x=2147483648l;
		System.out.println("b3:"+b3);
		System.out.println("f:"+f);
		System.out.println("x:"+x);
	}
	public static void main(String[]args)
	{
		Datatypes aobj=new Datatypes();
		aobj.meth1();
		System.out.println(".......");
		aobj.meth2();
	}
    
	}