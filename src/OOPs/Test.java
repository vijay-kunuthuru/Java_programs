package OOPs;

interface Bank{
    void pay();
}
interface Bank2{
    void deposit();
}
class InterfaceDemo implements Bank,Bank2{
    @Override
    public void pay(){
        System.out.println("Inside pay methods");
    }
    public void deposit(){
        System.out.println("Inside deposit method");
    }
}
public class Test{
    public static void main(String[] args) {
        InterfaceDemo obj=new InterfaceDemo();
        obj.pay();
        obj.deposit();
    }
}