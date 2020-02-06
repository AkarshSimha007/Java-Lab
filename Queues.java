import java.util.*;
public class Queues {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s;
        int choice;
        ArrayList<String>queue=new ArrayList<String>();
        
        while(true){
            System.out.println("1.Add name\n2.Remove name\n3.Display\n4.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter a name to be added at rear");
                    s = sc.next();
                    queue.add(s);
                    System.out.println("Name added successfully");
                    break;

                case 2:
                    System.out.println("Removing the name at front");
                    queue.remove(0);
                    System.out.println("Name removed successfully");
                    break;

                case 3:
                    Iterator<String> itr = queue.iterator();

                    int size = queue.size();
                    if (size == 0)
                        System.out.println("Queue is Empty");

                    else {
                           System.out.println("Displaying the elements of Queue");
                           while (itr.hasNext()) {
                               String el = itr.next();
                               System.out.println(el);
                        }
                    }
                    break;

                case 4:System.exit(0);
                break;

                default:System.out.println("Invalid choice");
            }
        }
    }
}
