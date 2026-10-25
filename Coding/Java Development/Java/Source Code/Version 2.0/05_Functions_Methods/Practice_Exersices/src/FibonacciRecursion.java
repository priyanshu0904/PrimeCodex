import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to printing Fibonacci Series....");
        System.out.print("Enter the number of elements to be printed: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.println(fibonacciRecursion(i) + " ");
        }
    }

    public static int fibonacciRecursion(int position){
        System.out.print(".");
        if(position == 1){
            return 0;
        }else if(position == 2){
            return 1;
        }else {
            return fibonacciRecursion(position - 1) + fibonacciRecursion(position - 2);
        }
    }
}
