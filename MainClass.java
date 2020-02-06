import ISE.*;

import java.util.Scanner;

public class MainClass {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number of faculties");
    int n=sc.nextInt();
    ISE_department ob[]=new ISE_department[n];

    for(int i=0;i<n;i++)
    {
        ob[i]=new ISE_department();
        System.out.println("enter the details of faculty "+(i+1));
          ob[i].readdata();

    }for(int j=0;j<n;j++) {
        System.out.println("printing......");

        ob[j].print();
    }
    }

}





