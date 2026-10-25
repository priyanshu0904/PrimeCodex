import java.util.Scanner;

public class CalenderSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to PrimeCodex Calender.....");
        System.out.print("Enter the month number: ");
        int monthNumber = sc.nextInt();

        CalenderSwitch calender = new CalenderSwitch();
        String monthName = calender.monthName(monthNumber);
        System.out.println("Your month name is " + monthName);
    }

    public String monthName(int monthNumber){
        return switch(monthNumber){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Pluto Month";
        };

        //null means absence of any object, like return null;
    }
}
