import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Compound Interest Calculator....\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle amount(in Rs.): ");
        int principle = sc.nextInt();
        System.out.print("Tell me rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Tell me how many years you are borrowing this money: ");
        float years = sc.nextFloat();

        //Math.pow(double, double) and returns double
        //If you pass float or int values, it automatically converts to double, implicit type conversion
        double comp_int = principle * Math.pow((1 + rate / 100), years);
        System.out.println("Your intrest is Rs." + (comp_int - principle));
        System.out.println("You have to pay Rs." + comp_int);
    }
}
