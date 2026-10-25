import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Welcome to Armstrong Number Finder...\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        if(isArmstrong(num)){
            System.out.println("Armstrong..");
        }else{
            System.out.println("Not Armstrong..");
        }
    }

    public static boolean isArmstrong(int num){
        int noOfDigitsigits = digit(num);
        int sum = 0; //Accumulator pattern
        int i = num;
        while(i > 0){
            int digit = i % 10;
            i /= 10;
            sum += power(digit,noOfDigitsigits); //Accumulator pattern
        }
        return  sum == num;
    }

    public static int power(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

    public static int digit(int num){
        int digit = 0;
        while(num > 0){
            digit++;
            num /= 10;
        }
        return digit;
    }
}
