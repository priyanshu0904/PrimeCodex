package abstraction.Shape;

public class Square extends Shape{
    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2);
    }
}
