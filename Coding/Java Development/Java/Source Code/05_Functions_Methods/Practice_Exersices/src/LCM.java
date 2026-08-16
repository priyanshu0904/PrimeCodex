import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        System.out.println("Welcome to LCM Calculator....");
        int num1 = userInput();
        int num2 = userInput();

        int lcm = lcm(num1, num2);
        System.out.println("The LCM is " + lcm);
    }

    //LCM means Least Common Multiple.
    //If there are two numbers a and b, then the lcm of a and b is the least number which is completely divisible by both a and b
    //Read the multiple of smaller one and where the second number completely divides it that is the LCM.

    public static int userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = sc.nextInt();
        return num;
    }

    public static int lcm(int num1, int num2){
        int i = 1;
        while(i <= num2){
            int factor = num1 * i;
            if(factor % num2 == 0){
                return factor;
            }
            i++;
        }
        return 0; //for compiler and it is unreachable.
    }
}
