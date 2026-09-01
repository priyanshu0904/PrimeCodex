import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringToUniqueCharacters {
    static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        System.out.print("Please enter your string: ");
        Scanner sc = new Scanner(System.in);
        String userStr = sc.next();

        for (char c : userStr.toCharArray()) {
            unique.add(c);
        }

        System.out.printf("Size of unique character array is %d", unique.size());
    }
}
