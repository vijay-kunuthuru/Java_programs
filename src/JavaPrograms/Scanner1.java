package JavaPrograms;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your user name : ");
        String username = scan.nextLine();
        System.out.println("Enter your email : ");
        String email = scan.nextLine();
        System.out.println("Enter your password : ");
        String password = scan.nextLine();
        System.out.println("Enter your Current location : ");
        String address = scan.nextLine();


        System.out.println("\nusername : "+username);
        System.out.println("email : "+email);
        System.out.println("password : "+password);
        System.out.println("Address : "+address);
    }
}
