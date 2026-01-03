package JavaPrograms;
import java.util.*;
class User{
    String name;
    int accountNumber;
    String email;
    double balance;
}
public class Bank {
    static Scanner sc = new Scanner(System.in);
    static User[] users;
    static int userCount;
    public static void main(String[] args) {
        System.out.println("Welcome to the Magadha bank...");
        Scanner sc=new Scanner(System.in);



        while(true){
            String[] a={"1.Create account","2) Withdraw money","3) Deposit money","4) Display by user","0) Exit"};
            for (int i = 0; i <a.length ; i++) {
                System.out.println(a[i]);
            }
            System.out.println("Enter a number in above list to start : ");
            int n=sc.nextInt();
            if(n == 0){
                System.out.println("Exit");
                break;
            }
            switch (n){
                case 1: CreateAccount(); break;
                case 2: withdraw(); break;
                case 3: deposit(); break;
                case 4: display(); break;
                default: System.out.println("Invalid Choise");
            }
        }
        sc.close();
    }

    public static void CreateAccount(){
        System.out.print("Enter number of users: ");
        userCount = sc.nextInt();
        users = new User[userCount];
        for (int i = 0; i < userCount; i++) {
            users[i] = new User();

            System.out.println("User " + (i + 1));
            System.out.print("Name: ");
            users[i].name = sc.next();

            System.out.print("Account Number: ");
            users[i].accountNumber = sc.nextInt();

            System.out.print("Balance: ");
            users[i].balance = sc.nextDouble();

            System.out.print("Email: ");
            users[i].email = sc.next();
        }
    }
    public static void withdraw(){
        System.out.print("Enter user id: ");
        int id = sc.nextInt() - 1;

        if (id < 0 || id >= userCount) {
            System.out.println("Invalid user");
            return;
        }

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0)
            System.out.println("Invalid amount");
        else if (amount > users[id].balance)
            System.out.println("Insufficient balance");
        else {
            users[id].balance -= amount;
            System.out.println("Withdraw successful");
        }
    }
    public static void deposit(){
        System.out.print("Enter user id: ");
        int id = sc.nextInt() - 1;

        if (id < 0 || id >= userCount) {
            System.out.println("Invalid user");
            return;
        }

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0)
            System.out.println("Invalid amount");
        else {
            users[id].balance += amount;
            System.out.println("Final balance: " + users[id].balance);
        }
    }

    public static void display(){
        System.out.print("Enter user id: ");
        int id = sc.nextInt() - 1;

        if (id < 0 || id >= userCount) {
            System.out.println("Invalid user");
            return;
        }

        System.out.println("Name: " + users[id].name);
        System.out.println("Account No: " + users[id].accountNumber);
        System.out.println("Email: " + users[id].email);
        System.out.println("Balance: " + users[id].balance);
    }
}
