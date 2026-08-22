import java.util.Scanner;

public class MultiplicationTableUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table....");
        System.out.print("Enter the number you want to print table of: ");
        int num = sc.nextInt();


        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
