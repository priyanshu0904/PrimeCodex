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

        //working of all relational operators or comparison operators
        //result in boolean
        System.out.println(num1 == num2); //Equality
        System.out.println(num1 != num2); //Inequality
        System.out.println(num1 > num2); //Greater than
        System.out.println(num1 >= num2); //Greater than or equal to
        System.out.println(num1 < num2); //Less than
        System.out.println(num1 <= num2); //Less than or equal to
    }
}
