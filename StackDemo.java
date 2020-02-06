import java.util.*;
class Stack{
    int tos=-1,item,ditem,max=10;
    int arr[]=new int[10];
    Scanner sc=new Scanner(System.in);

    void push(){
        if(tos==9)
            System.out.println("Stack is full");
        else if(tos>=-1&&tos<9)
        {
            System.out.println("Enter element to be inserted");
            item=sc.nextInt();
            arr[++tos]=item;
            System.out.println("Element inserted successfully");
        }
    }
    void pop(){
        if(tos==-1)
            System.out.println("Stack is Empty");
        else
        {
            ditem=arr[tos--];
                System.out.println("Element deleted is "+ditem);
        }
    }

    void display(){
        if(tos==-1)
            System.out.println("Stack is Empty");
        else{
            System.out.println("Printing elements of the stack");
            for(int i=0;i<=tos;i++){
                    System.out.println(arr[i]);
            }
        }
    }
}


public class StackDemo {
    public static void main(String args[]) {
        Scanner d = new Scanner(System.in);
        Stack obj = new Stack();
        int choice;

        while (true) {
            System.out.println("1.PUSH\n2.POP\n3.Display\n4.Exit");
            System.out.println("Enter your choice\n");
            choice = d.nextInt();
            switch (choice) {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice");


            }
        }
    }
}
