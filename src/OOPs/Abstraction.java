package OOPs;
/*
Abstraction ---oops
 */
abstract class Abstraction {
    abstract void start();
    void fuel(){
        System.out.println("Hello");
    }
}
class Car extends Abstraction{
    void start(){
        System.out.println("car starts");
    }

    public static void main(String[] args) {
        Abstraction obj=new Car();
        obj.start();
        obj.fuel();
    }
}
