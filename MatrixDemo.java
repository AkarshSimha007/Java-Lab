import java.util.*;

public class MatrixDemo {
    public static void main(String args[]) {
        int m, n, p, q, i, j, k;

        Scanner sc = new Scanner(System.in);


            System.out.println("Enter the dimension of the first matrix");
            m = sc.nextInt();
            n = sc.nextInt();
            System.out.println("Enter the dimension of the second matrix");
            p = sc.nextInt();
            q = sc.nextInt();

            int a[][] = new int[m][n];
            int b[][] = new int[p][q];

            System.out.println("Enter the elements of the first matrix");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();
            }

            System.out.println("Enter the elements of the second matrix");
            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++)
                    b[i][j] = sc.nextInt();
            }


            int c[][] = new int[m][q];
            if (n != p)
                System.out.println("Matrix multiplication is not possible");
            else {
                int sum = 0;

                for (i = 0; i < m; i++) {
                    for (j = 0; j < q; j++) {
                        for (k = 0; k < p; k++) {
                            sum += a[i][k] * b[k][j];
                        }
                        c[i][j] = sum;
                        sum = 0;
                    }
                }
            }

            System.out.println("Printing the elements of the product matrix");

            for(i=0;i<m;i++){
                for(j=0;j<q;j++){
                    System.out.print(c[i][j]+"\t");

                }
                System.out.print("\n");
            }

    }
}

