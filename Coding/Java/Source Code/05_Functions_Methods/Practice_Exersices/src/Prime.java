import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime Checker");
        int num = userInput();
        if(isPrime(num)){
            System.out.println("Prime Number.");
        }else{
            System.out.println("Not a prime number.");
        }
    }

    public static int userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        return num;
    }

    public static boolean isPrime(int num){
        int i = 2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;

    }
}
