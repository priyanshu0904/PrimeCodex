import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        //Logic in while loop section
        //Do-while -> at-least runs once the code-block, otherwise similar to while
        //Code-block executes first then condition check and again execute till condition false
        //avoid infinite loops, always update

        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter your age: ");
//        int age = sc.nextInt();
//        while(age < 0 || age > 100){
//            System.out.print("Please enter your age: ");
//            age = sc.nextInt();
//        }
        int age = -1;
        //first iteration is unconditional, unlike while
        do{
            System.out.print("Please enter your age: ");
            age = sc.nextInt();
            //updation in do block
        }while(age < 0 || age > 100);

        System.out.println("Your age is " + age);
    }
}
