public class StringConcatenationToUpperCase {
    public static void main(String[] args) {
        String firstName = "Priyanshu";
        String lastName = "Raj";
        //String fullName = firstName + " " + lastName;
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
    }
}
