import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        System.out.println("We are doing Float Multiplication...\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two floating point numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double product = num1 * num2;
        System.out.println("The product is " + product);

        System.out.println(9 + 5 + "ABC"); //According to BODMAS, left to right evaluation
        System.out.println("ABC" + 9 + 5); // Consider whole as string, solved according to BODMAS
        System.out.println("ABC" + 9 * 5); //BODMAS, multiplication solved first
        //System.out.println("ABC" + 9 - 5); gives error
    }
}
