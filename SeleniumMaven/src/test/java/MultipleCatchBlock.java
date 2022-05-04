
public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
				{
					int a[]=new int [5];
					a[9]=30/0;
				}
				
				catch (ArrayIndexOutOfBoundsException e)
				{
					System.out.println("There is no index to which you are trying to store value");
					System.out.println("ArrayIndexOutOfBoundsException exception is executed");
				}
				
				catch (ArithmeticException e)
				{
					System.out.println("Please do not enter zero");
					System.out.println("ArithmeticException is Executed");
				}
			}
			

	}


