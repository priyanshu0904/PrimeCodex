import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial Calculator....");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number you want to calculate factorial of: ");
        int num = sc.nextInt();

        long factorial = factorial(num);
        System.out.println("The factorial of " + num + " is: " + factorial);
    }

    public static long factorial(int num){
        int i = num;
        long fact = 1;
        if(num < 2){
            return 1; //This return ends the further function execution
        }
        while(i >= 2){
            fact *= i;
            i--;
        }
        return fact;
    }
}
