public class StringFormat {
    public static void main(String[] args) {
        String name = "Priyanshu";
        int marks = 45;
        System.out.println("Hello " + name + ", your marks are " + marks + "%.");
        //too much string concatenation, memory wastage

        //use String.format(), or System.out.printf() or Formatter etc
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
        String name1 = "Priyanshu";
        System.out.printf("Hello %S", name1);
        System.out.println();
        System.out.printf("Hello %15s", name1);
        System.out.println();
        System.out.printf("Hello %-15s", name1);
        System.out.println();
        System.out.printf("Hello %15s", name1);
        System.out.println();

        int marks1 = 8888;
        System.out.printf("Hello %s, your marks is %d", name1, marks1);
        System.out.println();
        System.out.printf("Hello %s, your marks is %8d", name1, marks1);
        System.out.println();
        System.out.printf("Hello %s, your marks is %08d", name1, marks1);
        System.out.println();
        System.out.printf("Hello %s, your marks is %-8d", name1, marks1);
        System.out.println();
        System.out.printf("Hello %s, your marks is %,d", name1, marks1);
        System.out.println();
        System.out.printf("Hello %s, your marks is %,08d", name1, marks1);
        System.out.println();
        System.out.printf("Hello %s, your marks is %-+,8d", name1, marks1);
        System.out.println();

        float hehe = 88.6666f;
        System.out.printf("The hehe is %.2f", hehe); //it will round off the things
    }
}
