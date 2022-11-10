package array;


public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,14,21,29,70,35};
		int b[]= {14,21,70,80,22,35};
		int c[]=new int[a.length]; 
		int n=0;
		
		// nested loops for checking the similar elements.
		for(int i=0,k=0;i<a.length;i++)
		{ 
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==b[j]) 
				{
					c[k++]=a[i];
					n++; 
				}
				
			}
				
		}
		// printing the array..
		System.out.println("common elements are...");
		for(int i=0;i<n;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}

  