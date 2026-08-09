import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        //Age category determine based on age
        System.out.println("Welcome to AGE Category determiner...\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        if(age >=60){
            System.out.println("Senior Citizen");
        }
        else if(age >= 20){
            System.out.println("Adult");
        }
        else if(age >= 13){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Child");
        }
    }
}
