public class TypeConversion {
    static void main(String[] args) {
        //Automatic or widening or implicit or coercion
        float myFloat = 99;
        float yourFloat = 88L;
        double myDouble = 8.88f;
        System.out.println(myFloat);
        System.out.println(yourFloat);
        System.out.println(myDouble);

        //Narrowing or explicit or casting, data may loss
        int myInt = (int)5.0f;
        int yourInt = (int)5.458f;
        System.out.println(myInt);
        System.out.println(yourInt);
    }
}
