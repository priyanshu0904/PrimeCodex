public class ArrayConcatenation {
    public static void main(String[] args) {
        String[] arr = new String[] {"Hello", " Priyanshu,", " How", " are", " you"};
        StringBuilder string = new StringBuilder();
        for (String s : arr) {
            string.append(s);
        }

        System.out.println(string);
    }
}
