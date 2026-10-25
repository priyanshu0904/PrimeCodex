package Week;

public class TestAgain {
    static void main(String[] args) {
        System.out.println("Printing Days: ");
        for (Days day : Days.values()) {
            System.out.printf("%s is %s\n", day, day.getType());
        }
    }
}
