public class Multidimenson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][]=new int[2][2];
		int B[][]=new int[2][2];
		int C[][]=new int[2][2];
		A[0][0]=1;
		A[0][1]=2;
		A[1][0]=3;
		A[1][1]=4;
		B[0][0]=5;
		B[0][1]=6;
		B[1][0]=7;
		B[1][1]=8;
		int i,j;
		for(i=0;i<=1;i++)
		{
			for(j=0;j<=1;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
				System.out.println(C[i][j]);
			}
					
		}
	}	
}