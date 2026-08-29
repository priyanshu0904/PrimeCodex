public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Priyanshu, ");
        sb.append("how are "); //.append() is a method
        sb.append("you");
        sb.append(904);
        System.out.println(sb); //it is actually sb.toString();
    }
}
