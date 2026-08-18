import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Welcome to Ticket Discount Calculator...");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        System.out.print("Are you a female? (true/false): ");
        boolean isFemale = sc.nextBoolean();

        if(age < 5){
            System.out.println("75% discount");
        }
        else if(isFemale){
            System.out.println("50% discount");
        }
        else if(age > 60 && !isFemale){
            System.out.println("25% discount");
        }
        else{
            System.out.println("No discount");
        }

        //working of logical operators: always applies on boolean value
        boolean first = true;
        boolean second = false;

        //These operators are also known as short-circuit operators.

        //logical AND &&
        System.out.println(first && first); // both true, then true
        System.out.println(first && second);
        System.out.println(second && first); // if first condition is false then it will not check the other ones and give false (Short-circuit)
        System.out.println(second && second);

        //logical OR ||
        System.out.println(first || first); // if first condition is true then it will not check the other ones and give true (Short-circuit)
        System.out.println(first || second);
        System.out.println(second || first);
        System.out.println(second || second); // both false, then false

        //logical NOT ! (bang or exclamation sign) : Invert the boolean value
        System.out.println(!first); //true -> false
        System.out.println(!second); //false -> true
    }
}
