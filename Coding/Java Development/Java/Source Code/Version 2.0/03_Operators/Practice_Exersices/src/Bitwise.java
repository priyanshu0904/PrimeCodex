import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        //Use all bitwise operators by taking two numbers from user
        System.out.println("Welcome to Bitwise Calculator...\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        //Bitwise AND &
        System.out.println(a & b);

        //Bitwise OR |
        System.out.println(a | b);

        //Bitwise XOR ^ (cap sign)
        System.out.println(a ^ b);

        //Bitwise NOT ~ (tilled sign) -> also known as complement of a number
        System.out.println(~a);
        System.out.println(~b);

        //Left shift operator <<, a << b; a is the number and b is how many times shifting left
        System.out.println(a<<1);
        System.out.println(b<<2);

        //Right shift operator >>, a >> b; a is the number and b is how many times shifting right
        System.out.println(a>>1);
        System.out.println(b>>2);
    }
}
