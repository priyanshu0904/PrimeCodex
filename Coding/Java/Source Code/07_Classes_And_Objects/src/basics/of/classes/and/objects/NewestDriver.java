package basics.of.classes.and.objects;

public class NewestDriver {
    //This Class is used after the default constructor is initialized in Car class
    public static void main(String[] args) {
        Car buggati = new Car("Pink");
        Car thar = new Car();
        thar = null; //For finalize() but it is removed by java in newer versions
        buggati.start().drive();
        System.out.println(buggati.color);
        System.out.println(buggati.maxSpeed);
    }
}
