import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome finder.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("Palindrome Number....");
        }else{
            System.out.println("Not a palindrome number....");
        }
    }

    public static boolean isPalindrome(int num){
        if(num == reverse(num)){
            return true;
        }
        return false;
    }

    public static int reverse(int num){
        int rev = 0;
        while(num > 0){
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        return rev;
    }
}
