public class FinalKeyword {
    final double PI = 3.1412;
    //convention for final things, use all as a capital letter
    final int STUDENT_MARKS = 99;

    void testing(){
        //PI = 56; //gives error, trying to reassign the final variable
        //STUDENT_MARKS = 99;
    }
    public static void main(String[] args) {
        FinalKeyword fk = new FinalKeyword();
        System.out.println(fk.PI * 88);

        //fk.PI = 8; //can't be changed

        //apply final to variable -> Constant, initializing once and in same line
        //using final -> performance optimization, as compiler can make certain assumptions
        //must be initialized before constructor completes, reducing null pointer error
        //helps in creating immutable objects
    }
}
