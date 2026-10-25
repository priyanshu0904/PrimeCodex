package polymorphism.Transport;

public class Car extends Vehicle{
    @Override
    public void service() {
        super.service();
        System.out.println("My Car is getting serviced");
    }
}
