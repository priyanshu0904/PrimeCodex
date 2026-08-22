import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int num1 = input(); //Function returns int, so result can be stored in int variable or type conversion.
        int num2 = input();

        int sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }

    public static void greet(){
        //function doesn't return anything, data-type is void, jumping statement, control statement
        System.out.println("Welcome to Calculator....\n");
        int number = input(); //ANy method can be called anywhere
        System.out.println("Any function can be called anywhere....So the number is " + number);
    }

    /**
     * This input() function takes a number from user and return it.
     * @return
     */
    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt(); //This is also a method
        if(num == 0){
            return 0; //return ends the function immediately
        }
        return num; //it can return only one thing not multiple
    }
}
