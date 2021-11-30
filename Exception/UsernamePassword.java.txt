import java.util.Scanner;
class IllegalUsernameException extends Exception {
    public IllegalUsernameException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) throws IllegalUsernameException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        if(username.length() < 6 && username.length() > 15 ){
            throw new IllegalUsernameException("Username must be of length 6-15 characters");
        }
        char first = username.charAt(0);
        if(!(first >= 65 && first <= 90 )) {
            throw new IllegalUsernameException("Username must start with uppercase letters A-Z");
        }
        if(password.length() < 8 && password.length() > 256) {
            throw new IllegalUsernameException("Password must be of length 8-256 characters");
        }
        if(username.contains(" ") && username.contains("(") && username.contains(")")) {
            throw new IllegalUsernameException("Username should not contain spaces or parenthesis");
        }
        if(password.contains(" ") && password.contains("(") && password.contains(")")) {
            throw new IllegalUsernameException("Password should not contain spaces or parenthesis");
        }
        if(password.contains(username)){
            throw new IllegalUsernameException("Password should not contain or same as Username");
        }
    }
}