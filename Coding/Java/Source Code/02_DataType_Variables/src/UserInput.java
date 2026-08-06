import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Good Morning " + name);

        System.out.print(name + " enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
    }
}
