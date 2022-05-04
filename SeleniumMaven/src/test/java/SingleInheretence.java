 class Superclass 
		 {
		 void meth1()
		 {
		 	System.out.println("meth1() Called");
		 }
		 void meth2()
		 {
		 	System.out.println("meth2() Called");
		 }
		 }

		 public class SingleInheretence extends Superclass
		 {
		 	void meth3()
		 	{
		 		System.out.println("meth3() Called");
		 	}
		 	public static void main(String[] args) 
		 	{
		 		SingleInheretence obj=new SingleInheretence();
		 		obj.meth1();
		 		obj.meth2();
		 		obj.meth3();
		 	}
		

	}


