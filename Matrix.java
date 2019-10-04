import java.util.Scanner;


public class Matrix {

	public Matrix() {
		// TODO Auto-generated constructor stub
	}
	int m,n,p,q,sum=0,i,j,k;
	int s[][]=new int[10][10];
    int multiply[][] = new int[10][10];
    int f[][]=new int[10][10];
	

	
	void read()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows and columns of first matrix:");
	m=sc.nextInt();
	n=sc.nextInt();
	
	
	System.out.println("Enter the elements of the first Matrix:");
	for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			f[i][j]=sc.nextInt();
	
	  System.out.println("Enter the number of rows and columns of second matrix");
      p = sc.nextInt();
      q = sc.nextInt();
      
      if(n!=p)
      {
    	  System.out.println("The matrices cannot be multiplied");
      }
      else 
      { 
      
      
  	    System.out.println("Enter the elements of the second Matrix:");
  	    for(i=0;i<m;i++)
  		  for(j=0;j<n;j++)
  		    s[i][j]=sc.nextInt();
      }
}
      
      void product(int[][] f,int[][] s,int[][] multiply)
      { 
       for (i = 0; i < m; i++)
       {
         for (j = 0; j < q; j++)
         {  
            for (k = 0; k < p; k++)
            {
               sum = sum + f[i][k]*s[k][j];
            }
            multiply[i][j] = sum;
            sum = 0;
         }
    	  
       }
     } 
     
      void display(int[][] multiply)
      { System.out.println("Product of the matrices:");
      
         for (i = 0; i < m; i++)
        {
           for (j = 0; j < q; j++)
            System.out.print(multiply[i][j]+"\t");

         System.out.print("\n");
        }
      }
      
      
      
      public static void main(String args[]) 
      { 
    	  Matrix mat=new Matrix();
    	
    	  mat.read();
          mat.product(mat.f,mat.s,mat.multiply);
		
          mat.display(mat.multiply);
  	  }

}
