import java.util.Scanner;

public class GCD {
    //GCD stands for Greatest Common Divisor.
    //Highest number which divides both a and b is the GCD of a and b.
    public static void main(String[] args) {
        System.out.println("Welcome to GCD Calculator");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int first = sc.nextInt();
        System.out.print("Please enter second number: ");
        int second = sc.nextInt();

        int gcd = gcd(first, second);
        System.out.println("GCD is " + gcd);
    }

    public static int gcd(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while(i <= least){
            if((num1 % i == 0 )&& (num2 % i == 0)){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if(num1 < num2){
            return num1;
        }
        else {
            return num2;
        }
    }
}
