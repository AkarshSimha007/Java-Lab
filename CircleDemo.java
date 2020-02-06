import java.util.*;
import java.lang.Math;

class Circle{
    Scanner sc=new Scanner(System.in);
    float radius;
    Circle(float radius){
        this.radius=radius;
    }

    double area() {
        return(Math.PI*(radius*radius));
    }
}

class Sector extends Circle{
    int ctrangle;
    Sector(float radius) {
        super(radius);

    }

    double sectorarea()
    {
        System.out.println("Enter the control angle for the sector");
        ctrangle=sc.nextInt();
        return((0.5*radius*radius)*Math.toRadians(ctrangle));
    }
}

class Segment extends Circle{
  float length;
    Segment(float radius) {
        super(radius);
        this.length=length;
    }

    double segmentarea(){
        System.out.println("Enter the length of the segment");
        length=sc.nextInt();
        double a=radius*radius*((radius-length)/radius);
        double b=(radius-length)*(Math.sqrt(2*radius*length-(length*length)));
        return(a-b);
    }
}

public class CircleDemo {
    public static void main(String args[]){
        float r;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        r=d.nextFloat();
        Circle ob1=new Circle(r);
        System.out.println("The area of circle is"+" "+ob1.area());

        Sector ob2= new Sector(r);
        System.out.println("The area of sector is"+" "+ob2.sectorarea());

        Segment ob3=new Segment(r);
        System.out.println("The area of segment is"+" "+ob3.segmentarea());


    }
}
