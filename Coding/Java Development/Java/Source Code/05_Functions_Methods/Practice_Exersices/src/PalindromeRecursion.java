import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome using recursion...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string to be check for palindrome: ");
        String str = sc.next();
        System.out.println("Your string is "
                + (isPalindrome(str) ? "Palindrome"
                                     : "Not Palindrome"));
    }

    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length() - 1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1, lastPos); //last value is not inclusive
        return isPalindrome(newStr);
    }
}
