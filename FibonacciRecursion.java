import java.util.*;
public class FibonacciRecursion {

    static int FibRec(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else{
            return FibRec(n-1)+FibRec(n-2);
    }
}
    public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n=sc.nextInt();
        System.out.println("Printing the Fibonacci Series");
        for(int i=0;i<n;i++)
        {  System.out.print(FibRec(i)+" ");
        }

    }
}
