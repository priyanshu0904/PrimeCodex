import java.util.Scanner;

public class PrintEvenUsingContinue {
    public static void main(String[] args) {
        System.out.println("Welcome to Even Printer....");
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
