import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        //To determine whether number is even or odd.
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("Number is Even.");
        }
        else{
            System.out.println("Number is Odd.");
        }
    }
}
