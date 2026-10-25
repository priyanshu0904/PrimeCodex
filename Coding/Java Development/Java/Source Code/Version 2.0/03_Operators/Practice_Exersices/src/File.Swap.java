import java.util.Scanner;

class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wlcome to PrimeCodex Swapping\n");

        System.out.print("Enter first value: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second value: ");
        int num2 = sc.nextInt();

        //Before Swapping
        System.out.println("First Value: " + num1);
        System.out.println("Second Value: " + num2);

        //Swap Logic
        int temp = num1; //taking temporary variable
        num1 = num2;
        num2 = temp;

        //After Swapping
        System.out.println("Swapping Done...");
        System.out.println("First Value: " + num1);
        System.out.println("Second Value: " + num2);
    }
}
