import java.util.*;
public class Fibonacci{
    public static void main(String args[]) {
        int a=0,b=1,c,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n=sc.nextInt();
        System.out.println("Printing the Fibonacci Series");
        for(int i=0;i<n;i++)
        {
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.print("\n");
    }
}