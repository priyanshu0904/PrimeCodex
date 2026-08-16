import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Please Enter second number: ");
        int secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.print("The Sum of two numbers is " + sum);
    }
}
