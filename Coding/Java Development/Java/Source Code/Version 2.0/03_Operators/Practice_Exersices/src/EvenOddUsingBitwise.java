import java.util.Scanner;

public class EvenOddUsingBitwise {
    public static void main(String[] args) {
        //To find the number is even or odd using bitwise operator
        System.out.println("Welcome to EvenOdd Calculator using Bitwise Operations....\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = sc.nextInt();

        //only last digit will evaluate and based on that if 1 then odd and if 0 then even
        if((number & 1) == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
