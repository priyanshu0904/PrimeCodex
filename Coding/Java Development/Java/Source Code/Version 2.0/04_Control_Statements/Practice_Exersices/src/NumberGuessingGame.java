import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game...");
        int num;
        do{
            System.out.print("Guess the number: ");
            num = sc.nextInt();
        }while(!isGuessed(num));
        System.out.println("You have successfully guessed the number 🎉🍾");
    }

    public static boolean isGuessed(int num){
        int aiNumber = 8;
        if(num == aiNumber){
            return true;
        }
        System.out.println("Oh no, guessed wrong....");
        return false;
    }
}
