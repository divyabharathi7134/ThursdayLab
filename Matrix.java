package array;

public class Matrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{4,3,2},{3,2,4},{1,2,3}};
		//2 Dimensional array with 3 rows and 3 columns.
		int b[][]= {{2,3,4},{1,1,3},{2,2,3}};
		//2 Dimensional array with 3 rows and 3 columns.
		int c[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				c[i][j]=0;
			
				for(int k=0;k<a.length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		
		
		// printing the final array.
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	
		
	}

}

