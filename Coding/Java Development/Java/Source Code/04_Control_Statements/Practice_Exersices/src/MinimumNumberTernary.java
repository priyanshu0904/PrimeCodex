import java.util.Scanner;

public class MinimumNumberTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to PrimeCodex minimum finding...");

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        MinimumNumberTernary min = new MinimumNumberTernary();
        int minimum = min.minimum(num1, num2);
        System.out.println("Minimum is " + minimum);
    }

    public int minimum(int num1, int num2){
        int minimum = num1 < num2 ? num1 : num2;
        return minimum;
    }
}
