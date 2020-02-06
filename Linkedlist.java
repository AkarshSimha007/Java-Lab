import java.util.*;
public class Linkedlist {
    public static void main(String args[]){
        LinkedList<String>ll=new LinkedList<>();
//        Iterator<String>itr=ll.iterator();
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("1.Add Name\n2.Display\n3.Exit\n");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1:System.out.println("Enter the the name to be added");
                String name=sc.next();
                ll.add(name);
                    System.out.println("Name added successfully");
                break;

                case 2:

                    if(ll.peekFirst()==null) {
                        System.out.println("List is Empty");
                    }
                        else{
                        Iterator<String> itr = ll.iterator();

                        while(itr.hasNext()) {
                                String el = itr.next();

                                if (el.length()< 5) {
                                    System.out.println(el);
                                }
                            }
                        }
                        break;
                case 3:System.exit(0);

                default:System.out.println("Invalid choice");
                    }
        }
    }

}

