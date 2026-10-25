import java.util.Scanner;

public class NumberGuessingGame {
    int random;

    NumberGuessingGame(){
        random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     *
     * @param guessNumber the number that player guess
     * @return
     * - Negative if the guessed number is smaller
     * - 0 if the guessed number is correct
     * - Positive if the gussed number is higher
     */
    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Number Guessing Game....");
        Scanner sc = new Scanner(System.in);
        NumberGuessingGame game = new NumberGuessingGame();

        System.out.println("Guess the number between 1-100");
        int guess;
        int result;
        do{
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            result = game.guess(guess);
            if(result == 0){
                System.out.println("Congrats, Guessed Correct🍾");
            }else if(result < 0){
                System.out.println("Please Guess Higher");
            }else{
                System.out.println("Please guess Lower");
            }
        }while(result != 0);
    }
}
