import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int num1 = input();
        int num2 = input();

        int sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }

    public static void greet(){
        System.out.println("Welcome to Calculator....\n");
    }

    /**
     * This input() function takes a number from user and return it.
     * @return
     */
    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        return num;
    }
}
