import java.util.Scanner;

public class Circle {
    double radiusInCms;

    Circle(double radiusInCms){
        this.radiusInCms = radiusInCms;
    }

    double getCircumference(){
        return 2 * radiusInCms * Math.PI;
    }

    double getArea(){
        return Math.PI * Math.pow(radiusInCms, 2);
    }

    @Override
    public String toString() {
        return "Circle Props: Radius in cm: " + radiusInCms
                + ", Circumference in cm: " + getCircumference()
                + " , Area in cm^2: " + getArea() ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Circle...");
        System.out.print("Please enter the Radius in cms: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
    }
}
