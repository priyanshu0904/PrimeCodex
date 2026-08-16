import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        //To find whether the number is positive, negative or zero
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = sc.nextInt();

        if(number == 0){
            System.out.println("The number is Zero.");
        }
        else if(number > 0){
            System.out.println("The number is Positive.");
        }
        else{
            System.out.println("The number is Negative.");
        }
    }
}
