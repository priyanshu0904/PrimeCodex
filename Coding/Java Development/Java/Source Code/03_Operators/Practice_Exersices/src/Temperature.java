import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Welcome to Temperature Converter....\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in fahrenheit: ");
        double fahr = sc.nextDouble();

        double cels = (fahr - 32) * 5.0/9.0; //to be safe, no integer division
        System.out.println("The temperature in celsius is: " + cels);


    }
}
