package exception;

import java.util.Scanner;

public class Division {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Dear...");
        System.out.print("Please enter two numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();

        try{
            int result = first / second;
            System.out.println("Result is " + result);
        } catch (ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.printf("Ohh!!! Error, %s occured", exception.getMessage());
            }
            else{
                throw exception;
            }
        }
    }
}
