import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Prime Checker....");
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();

        System.out.println("Your number is " + (isPrime(num) ? "Prime" : "Not Prime"));

//        boolean isPrime = isPrime(num);
//        if(isPrime){
//            System.out.println("It is a Prime number...");
//        }else{
//            System.out.println("Not a Prime number...");
//        }
    }

    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
