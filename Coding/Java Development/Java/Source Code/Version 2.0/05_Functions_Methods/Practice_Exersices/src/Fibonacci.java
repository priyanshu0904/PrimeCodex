import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci Series Generator");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number upro which you want to generate the Fibonacci Series: ");
        int num = sc.nextInt();

        fibonacci(num);
    }

    public static void fibonacci(int num){
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");

        int x = 0, y = 1;
        int z = 0;
        while((x + y) <= num){
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;

        }
    }

}
