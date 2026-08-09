import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        //Consider a quadrilateral, all sides have different length
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Perimeter calculator...\n");

        System.out.println("Please enter all four sides in cms:");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double side4 = sc.nextDouble();

        double perimeter = side1 + side2 + side3 + side4;
        System.out.println("The Perimeter is " + perimeter + " cms.");
    }
}
