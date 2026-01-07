package OOPs;
interface Payment {
    void processPayment(double amount);
}
class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class PhonePay implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using PhonePay");
    }
}

class DebitCardPay implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using DebitCard");
    }
}
public class EcommercePayment {
    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PhonePay();
        Payment payment3 = new DebitCardPay();

        payment1.processPayment(1000);
        payment2.processPayment(500);
        payment3.processPayment(2000);
    }
}
