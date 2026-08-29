public class StringFormat {
    public static void main(String[] args) {
        String name = "Priyanshu";
        int marks = 45;
        System.out.println("Hello " + name + ", your marks are " + marks + "%.");
        //too much string concatenation, memory wastage

        //the syntax of format-specifier
        //[flags] [width] [.precision] specifier-character
        System.out.printf("Hello %s, your marks are %d%%.", name, marks);
        System.out.println(); //printf doesn't adds new line, explicitly add it
        System.out.printf("Hello %S, your marks are %d%%.", name, marks);
        System.out.println();
        //sequence of variables must be same as specifier sequences

        float percentage = 88.5f;
        System.out.printf("The percentage is %f.", percentage);
        System.out.println();

        boolean isEligible = true;
        System.out.printf("The User is Eligible to vote: %b", isEligible);
        System.out.println();
    }
}
