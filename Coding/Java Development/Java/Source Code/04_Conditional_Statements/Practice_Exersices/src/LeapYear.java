import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //To find whether a given year is leap year
        System.out.println("Welcome to Leap Year Finder.\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the year....");
        int year = sc.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is Leap Year.");
        }
        else{
            System.out.println(year + " is Non-leap Year.");
        }
    }
}
