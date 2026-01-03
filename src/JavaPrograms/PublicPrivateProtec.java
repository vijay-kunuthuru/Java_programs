package JavaPrograms;

public class PublicPrivateProtec {
    public static void publicMethod(){
        System.out.println("public method");
    }

    private static void privateMethod(){
        System.out.println("private method");
    }
    protected static void protectedMethod(){
        System.out.println("protected method");
    }

    public static void main(String[] args) {
        privateMethod();
    }
}
