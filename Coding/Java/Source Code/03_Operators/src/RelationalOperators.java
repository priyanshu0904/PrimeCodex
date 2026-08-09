import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Driving Licence Portal");
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are Eligible");
        }
        else{
            System.out.println("Beta masti nhiiii...");
        }

        int num1 = 55;
        int num2 = 55;

        //working of all relational operators
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
    }
}
