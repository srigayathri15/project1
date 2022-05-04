
public class Methodoverloading1 
{
	public static void main(String[] args)
	{
		Methodoverloading1 obj=new Methodoverloading1();
		obj.add(5, 6);
		obj.add(8.80, 9.43);
		obj.add(10.4578,15.4758);
		obj.add(10,12,15);
	}
void add (int x,int y)
{
	int sum=x+y;
	System.out.println("sum of two integers is "+sum);
}
void add (float x,float y)
{
	float sum=x+y;
	System.out.println("sum of two floatsis "+sum);
}
void add (double x,double y)
{
	double sum=x+y;
	System.out.println("sum of two double"+sum);
}
void add(int x,int y,int z)
{
	int sum=x+y+z;
	System.out.println("sum of three int is "+sum);
}
}

	





	
