package polymorphism.Calculator;

public class Test {
    static void main() {
        Calculator calci = new Calculator();
        System.out.println(calci.add(55,22));
        System.out.println(calci.add(12,22,89));
        System.out.println(calci.add(5.9,8.7));
    }
}
