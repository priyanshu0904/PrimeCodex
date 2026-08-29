public class StringFormat {
    public static void main(String[] args) {
        String name = "Priyanshu";
        int marks = 45;
        System.out.println("Hello " + name + ", your marks are " + marks + "%.");
        //too much string concatenation, memory wastage

        System.out.printf("Hello %s, your marks are %d%%.", name, marks);
        System.out.println();
        System.out.printf("Hello %S, your marks are %d%%.", name, marks);
    }
}
