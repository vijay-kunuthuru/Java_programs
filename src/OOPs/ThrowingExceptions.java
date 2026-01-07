package OOPs;

public class ThrowingExceptions {
    public static void validateAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if(age < 18){
            throw new IllegalArgumentException("Must be 18 or older");
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        validateAge(0);
    }
}
