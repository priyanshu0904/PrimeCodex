import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Welcome to Area Calculator...\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the base of triangle in cms: ");
        double base = sc.nextDouble();
        System.out.print("Please enter the perpendicular height of triangle in cms: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of this given triangle is " + area + " sq. cm");
    }
}
