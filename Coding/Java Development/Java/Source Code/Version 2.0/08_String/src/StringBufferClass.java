public class StringBufferClass {
    public static void main(String[] args) {
        //similar to StringBuffer
        String str = "Hello";
        StringBuffer sb = new StringBuffer("Hello Guys ");
        sb.append("how are you all "); //.append() is a method
        sb.append("your score is ");
        sb.append(88);
        sb.append(" " + str);
        System.out.println(sb); //Hello Guys how are you all your score is 88

        //StringBuffer is mutable, stored in heap not in string pool
        //Thread safe, use in multithreaded environment
        //Faster than String but Slower than StringBuilder
    }
}
