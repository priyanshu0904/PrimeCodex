import java.util.Scanner;

public class LoopPatterns {
    //Find the patterns structure in Patterns.java file.
    //Practice more and more Patterns questions.
    public static void main(String[] args) {
        System.out.println("Welcome to Pattern Printer....\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter number of rows: ");
        int rows = sc.nextInt();

        printRightHalfPyramid(rows);
        printReverseRightHalfPyramid(rows);
        printLeftHalfPyramid(rows);
    }

    public static void printRightHalfPyramid(int rows){
        System.out.println("\nHere is Right Half Pyramid: ");
        int i = 0;
        while(i < rows){
            int j = 0;
            while(j <= i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void printReverseRightHalfPyramid(int rows){
        System.out.println("\nHere is the Reverse Right Half Pyramid: ");
        int i = 0;
        while(i < rows){
            int j = rows;
            while(j > i){
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    public static void printLeftHalfPyramid(int rows){
        System.out.println("\nHere is the Left Half Pyramid: ");
        int i = 0;
        while(i < rows){
            //This loop prints the leading spaces
            int j = 0;
            while(j < rows - i - 1 ){
                System.out.print("  ");
                j++;
            }

            //This loop prints star
            int k = 0;
            while(k < i + 1){
                System.out.print("* ");
                k++;
            }

            System.out.println();
            i++;
        }
    }
}
