package OOPs;
class UserAccount {

    private String username;
    private String password;   // hidden

    public UserAccount(String uname, String pwd) {
        username = uname;
        setPassword(pwd);
    }

    private boolean isValidPassword(String pwd) {
        if (pwd.length() < 8) {
            return false;
        }

        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isDigit(pwd.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public void setPassword(String pwd) {
        if (isValidPassword(pwd)) {
            password = pwd;
        } else {
            System.out.println("Password must be with 8 characters and contain a number");
        }
    }

    public String getUsername() {
        return username;
    }
    public String getPassword(){
        return password;
    }

    public boolean login(String pwd) {
        return password.equals(pwd);
    }
}
public class CreateAccount {
    public static void main(String[] args) {

        UserAccount u = new UserAccount("Vijay", "Vijay@123");

        System.out.println("Username : " + u.getUsername());
        System.out.println("Password : "+u.getPassword());

        if (u.login("test1234")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}
