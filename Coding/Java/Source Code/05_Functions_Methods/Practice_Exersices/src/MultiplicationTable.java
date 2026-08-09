import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Table Generator.....\n");

        System.out.print("Please enter a number you want to print the table of: ");
        int num = sc.nextInt();

        System.out.println("The table of " + num + " is: ");
        multiplicationTable(num);
    }

    public static void multiplicationTable(int number){
        int i = 1;
        while(i <= 10){
            System.out.println(number + " X " + i + " = " + (number * i));
            i++;
        }
    }
}
