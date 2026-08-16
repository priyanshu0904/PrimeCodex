import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to PrimeCodex Basic Integer Calculator...");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        int addition = number1 + number2;
        System.out.println("The addition of " + number1 + " and " + number2 + " is: " + addition);

        int subtraction = 0;
        if(number1 >= number2){
            subtraction = number1 - number2;
            System.out.println("The subtraction of " + number1 + " and " + number2 + " is: " + subtraction);
        }else{
            subtraction = number2 - number1;
            System.out.println("The subtraction of " + number2 + " and " + number1 + " is: " + subtraction);
        }

        int multiplication = number1 * number2;
        System.out.println("The multiplication of " + number1 + " and " + number2 + " is: " + multiplication);

        int division = 0;
        if(number2 == 0){
            System.out.println("Division can not be performed....Try other values");
        }else{
            division = number1 / number2;
            System.out.println("The integer division of " + number1 + " and " + number2 + " is: " + division);
        }

        int remainder = 0;
        if(number2 == 0){
            System.out.println("Remainder can not be calculated....Try other values");
        }else{
            remainder = number1 % number2;
            System.out.println("The remainder of " + number1 + " and " + number2 + " is: " + remainder);
        }
    }
}
