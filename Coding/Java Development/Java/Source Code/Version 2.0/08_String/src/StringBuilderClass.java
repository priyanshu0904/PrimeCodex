public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Priyanshu, ");
        sb.append("how are "); //.append() is a method
        sb.append("you");
        sb.append(904);
        //it is actually sb.toString();
        System.out.println(sb); //Hello Priyanshu, how are you904

        //StringBuffer and StringBuilder when to use?
        //In the print statement we use String Format, but if we directly have to return the String through a function then they are used
        //Then we directly use append method to add or concatenate string

        //StringBuilder is mutable, stored in heap not in string pool
        //Not thread safe, so use in single threaded environment
        //comparably fastest, than String and StringBuffer
    }
}
