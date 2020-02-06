import java.util.*;
class Account {
    int Accno;
    long Phone_No;
    String  name;
    float balance_amt,deposit,withdraw;

    Scanner sc=new Scanner(System.in);

    void getinput() {

        System.out.println("Enter Account holder's Name");
        name=sc.next();
        System.out.println("Enter Account Number");
        Accno=sc.nextInt();
        System.out.println("Enter Phone Number");
        Phone_No=sc.nextLong();
        System.out.println("Enter Current balance");
        balance_amt=sc.nextFloat();

    }

    void Deposit(){
        System.out.println("Enter The amount you want to deposit");
        deposit=sc.nextFloat();
        balance_amt+=deposit;
        System.out.println("New balance is "+balance_amt);
    }

    void Withdraw(){
        System.out.println("Enter The amount you want to Withdraw");
        withdraw=sc.nextFloat();
        if(withdraw<=balance_amt) {
            balance_amt-=withdraw;
            System.out.println("New balance is " + balance_amt);
        }
        else
            System.out.println("Insufficient balance");
    }

}

public class AccountDemo {
    public static void main(String args[]) {
        Scanner d = new Scanner(System.in);
        int choice;
        Account obj = new Account();
        obj.getinput();
        while (true) {
            System.out.println("1.Deposit\n2.Withdraw\n3.Exit");
            System.out.println("Enter your choice\n");
            choice = d.nextInt();
            switch (choice) {
                case 1:
                    obj.Deposit();
                    break;
                case 2:
                    obj.Withdraw();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice");
            }
        }
    }
}
