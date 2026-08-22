import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Password Checker....");
        String password;
        do{
            System.out.print("Enter your password...");
            password = sc.next();
        }while(!isValidPassword(password));

        System.out.println("Thanks for entering a valid password...");
    }

    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
