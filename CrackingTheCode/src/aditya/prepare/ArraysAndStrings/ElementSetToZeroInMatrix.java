package aditya.prepare.ArraysAndStrings;

public class ElementSetToZeroInMatrix {
	
	int m,n;
	
	private void setAllElementsToZero(int a[][],int m,int n)
	{
		boolean [] visited = new boolean[m+n];
		for(int i=0;i< m+n;i++) {
			System.out.println(i+":"+visited[i]);
		}
		System.out.println("------------------------------------");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++) {
				if(a[i][j] == 0) {
					visited[i]= true;
					visited[m+j] = true;
				}
			}
		}
		
		for(int i=0;i< m+n;i++) {
			System.out.println(i+":"+visited[i]);
		}

	}
	
	public static void main(String args[]) {
		ElementSetToZeroInMatrix zero = new ElementSetToZeroInMatrix();
		int a[][] = {{1,0,3},
				{4,5,6},
				{7,0,9}}; 
		zero.setAllElementsToZero(a, 3, 3);
	}
	
	

}
