package encapsulation.com.example.utils;

import encapsulation.com.example.geometry.Circle;
import encapsulation.com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rec = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rec.length * rec.breadth;

        System.out.printf("Area of Circle is %.2f and Area of Rectangle is %.2f.", cirArea, rectArea);
    }
}
