package OOPs;

public class CustomException {
    public static void main(String[] args) {

        try {
            UserService.registerUser(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
