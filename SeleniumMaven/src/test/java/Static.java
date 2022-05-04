
public class Static {

	
		int a=10;
			static int b=20;

			void meth1()
			{
				System.out.println("Value of a: "+a);
				System.out.println("Value of b: "+b);
			}
			static void meth2()
			{
				System.out.println("Value of a: "+new Static().a);
				System.out.println("Value of b: "+b);
			}
			public static void main(String[] args) 
			{
				Static obj=new Static();
				obj.meth1();
				meth2();
//				Static.meth2();
			}
			}