import java.util.Scanner;

public class GradeCalculatorTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student score.....");
        System.out.print("Please enter your marks: ");
        float marks = sc.nextFloat();
        //nested ternary operator
        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("You fall in " + category + " category.");
    }
}
