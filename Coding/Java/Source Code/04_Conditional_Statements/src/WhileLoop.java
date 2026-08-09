import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int start = 1; //Initialization

        //To print 10 numbers
        while(start <= 100){ //Condition
            System.out.println(start); //Actual work
            start++; //Updating
        }

        int end = 500;
        while(end >= 200){
            System.out.println(end);
            end -= 1;
        }

        //Can take multiple inputs
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < 5){
            int inp = sc.nextInt();
            System.out.println("Number is: " + inp);
            i = i + 1;
        }
    }
}
