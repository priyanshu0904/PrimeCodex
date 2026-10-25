import java.util.Scanner;

public class NumberOfOccurrencesUsingForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Finding occurrences...");
        MaximumElementUsingForEach maxi = new MaximumElementUsingForEach();
        int[] array = maxi.inputArray();

        System.out.print("Enter the number you want to search: ");
        int element = sc.nextInt();
        int occ = occurrences(array, element);
        System.out.println("Your element was found " + occ + " times.");
    }

    public static int occurrences(int[] array, int key){
        int count = 0;
        for(int num : array){
            if(num == key){
                count++;
            }
        }
        return count;
    }
}
