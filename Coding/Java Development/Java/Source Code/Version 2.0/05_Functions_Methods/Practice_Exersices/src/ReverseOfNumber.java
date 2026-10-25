import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse Generator...");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        int reverse = reverse(num);
        System.out.println("The reverse of " + num + " is " + reverse);
    }

    public static int reverse(int num){
        int i = num;
        int rev = 0;
        while(i > 0){
            rev = (rev * 10) + (i % 10);
            i /= 10;
        }
        return rev;
    }
}
