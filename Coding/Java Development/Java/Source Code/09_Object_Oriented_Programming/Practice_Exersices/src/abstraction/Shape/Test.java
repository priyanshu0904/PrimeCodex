package abstraction.Shape;

public class Test {
    static void main(String[] args) {
        Circle circle = new Circle(10.2);
        Square square = new Square(10);

        System.out.println(circle.getRadiusInCm());
        System.out.println(square.getSideLength());

        System.out.printf("Area of circle is: %.2f\n", circle.calculateArea());
        System.out.printf("Area of square is: %.2f", square.calculateArea());
    }
}
