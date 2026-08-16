import java.util.Scanner;

public class Arrays1D {
    public static void main(String[] args) {
        //1D array means array has one dimension only.

        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Marks Database");

        //Getting marks of student one by one
        int index = 0;
        while(index < marks.length){
            System.out.print("Enter the marks of " + (index + 1) + "th student: ");
            marks[index] = sc.nextInt();
            index++;
        }

        int j = 0;
        while (j < marks.length){
            System.out.println("The marks of Student " + (j + 1) + " is: " + marks[j]);
            j++;
        }
    }
}
