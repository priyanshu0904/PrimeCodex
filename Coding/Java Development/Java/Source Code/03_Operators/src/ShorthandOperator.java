import java.util.Scanner;

public class ShorthandOperator {
    public static void main(String[] args) {
        int a = 5;
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        // a = a + x1;
        a += x1; //Addition assignment
        System.out.println(a);

        int x2 = sc.nextInt();
        // a = a - x2;
        a -= x2; //Subtraction assignment
        System.out.println(a);

        int x3 = sc.nextInt();
        // a = a * x3;
        a *= x3; //Multiplication assignment
        System.out.println(a);

        int x4 = sc.nextInt();
        // a = a / x4;
        a /= x4; //Division assignment
        System.out.println(a);

        int x5 = sc.nextInt();
        // a = a % x5;
        a %= x5; //Remainder assignment
        System.out.println(a);
    }
}
