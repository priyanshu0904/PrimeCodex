import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Welcome to Table Printer...");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int i = 0;
        while(i < 10){
            System.out.println(num + " X " + (i + 1) + " = " + num * (i + 1));
            i++;
        }
    }
}
