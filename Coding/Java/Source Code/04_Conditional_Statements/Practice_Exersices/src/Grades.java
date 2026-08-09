import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        //To calculate Grade of a student based on marks
        System.out.println("Welcome to Grade Calculator....\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter yout percentage: ");
        float percentage = sc.nextFloat();

        if(percentage > 100){
            System.out.println("Enter correct percentage...");
        }
        else if(percentage >= 90){
            System.out.println("Grade A");
        }
        else if(percentage >=75){
            System.out.println("Grade B");
        }
        else if(percentage >= 60){
            System.out.println("Grade C");
        }
        else if(percentage >= 30){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Failed!!!!!!");
        }

        //Only one statement will run...
    }
}
