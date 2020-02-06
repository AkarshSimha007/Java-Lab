import java.util.*;
 class ComplexContent {
    int r1,r2,im1,im2;
    int real,img;
    ComplexContent(int r1, int r2, int im1, int im2){
        this.r1=r1;
        this.r2=r2;
        this.im1=im1;
        this.im2=im2;
    }
     void add()
     {
         real=r1+r2;
         img=im1+im2;
         System.out.println("The Sum of Complex numbers is");
         System.out.println(real+"+"+img+"i");
     }


    void subtract()
    {
        real=r1-r2;
        img=im1-im2;
        System.out.println("The difference of Complex numbers is");
        System.out.println(real+"+"+img+"i");
    }


    void product()
    {
        real=r1*r2-(im1*im2);
        img=(r2*im1)+(r1*im2);
        System.out.println("The product of Complex numbers is");
        System.out.println(real+"+"+img+"i");
    }
}


public class Complex{

    public static void main(String args[]){
        int r1,r2,im1,im2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real and imaginary parts of two complex numbers one by one");
        r1=sc.nextInt();
        im1=sc.nextInt();
        r2=sc.nextInt();
        im2=sc.nextInt();

        ComplexContent driver=new ComplexContent(r1,r2,im1,im2);
        driver.add();
        driver.subtract();
        driver.product();
    }
        }