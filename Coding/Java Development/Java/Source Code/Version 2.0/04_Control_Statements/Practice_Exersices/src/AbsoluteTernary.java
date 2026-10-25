import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to absolute value...");
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        //absolute value means the positive of number
        int result = num >= 0 ? num : -num;
        System.out.println("The absolute value of " + num + " is " + result);
    }
}
