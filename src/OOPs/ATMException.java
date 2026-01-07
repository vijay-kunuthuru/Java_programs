package OOPs;
import java.util.Scanner;
class insuffecientFundsException extends Exception{
    insuffecientFundsException(String message){
        super(message);
    }
}
class ATM{
    double balance=2000;

    void withdraw(double amount) throws insuffecientFundsException{
        if(amount <=0){
            throw new insuffecientFundsException("please enter amount greater than zero");
        }
        if(amount > balance){
            throw new insuffecientFundsException("Insufficient balance");
        }

        balance -=amount;
        System.out.println("withdraw successful");
        System.out.println("remaining balance : "+ balance);
    }
}
public class ATMException {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ATM a=new ATM();
        try{
            System.out.println("Enter amount to withdraw");
            double amount=sc.nextDouble();
            a.withdraw(amount);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Thank you");
            sc.close();
        }
    }

}
