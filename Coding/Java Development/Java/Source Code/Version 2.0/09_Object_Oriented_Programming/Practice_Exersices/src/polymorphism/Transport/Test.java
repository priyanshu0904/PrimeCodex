package polymorphism.Transport;

public class Test {
    static void main() {
        Car car = new Car();
        Vehicle vh = new Vehicle();
        car.service();
        vh.service();
    }
}
