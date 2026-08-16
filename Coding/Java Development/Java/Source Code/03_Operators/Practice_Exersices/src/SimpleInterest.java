import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Interest calculator...\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle amount(in Rs.): ");
        int principle = sc.nextInt();
        System.out.print("Tell me rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Tell me how many years you are borrowing this money: ");
        float years = sc.nextFloat();

        float interest = (principle * rate * years) / 100;
        System.out.println("Your interest is Rs." + interest);
        System.out.println("You have to return Rs." + (principle + interest));
    }
}
