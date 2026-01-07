package OOPs;

public class classMembers {
    // Static variable
    static int a;

    // Instance variable
    int b;

    // 🔹 Static Block
    static {
        a = 10;
        System.out.println("Static block executed");
        System.out.println("Static variable a = " + a);
    }

    // 🔹 Instance Block
    {
        b = 20;
        System.out.println("Instance block executed");
        System.out.println("Instance variable b = " + b);
    }

    // Constructor
    classMembers() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        // Creating first object
        classMembers obj1 = new classMembers();

        System.out.println("---- Creating second object ----");

        // Creating second object
        classMembers obj2 = new classMembers();
    }
}
