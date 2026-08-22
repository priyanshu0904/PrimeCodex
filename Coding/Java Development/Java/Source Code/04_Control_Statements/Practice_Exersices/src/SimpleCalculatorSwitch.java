import java.util.Scanner;

public class SimpleCalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to PrimeCodex Calculator....\n");
        System.out.print("Please enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter your second number: ");
        int num2 = sc.nextInt();
        System.out.print("Now enter the operation to be done: ");
        String operation = sc.next();

        int result = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> -1;
        };

        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
