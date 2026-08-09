public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        //Bitwise AND &
        System.out.println(a & b);

        //Bitwise OR |
        System.out.println(a | b);

        //Bitwise XOR ^
        System.out.println(a ^ b);

        //Bitwise NOT ~
        System.out.println(~a);
        System.out.println(~b);

        //Left shift operator <<
        System.out.println(a<<1);
        System.out.println(b<<2);

        //Right shift operator >>
        System.out.println(a>>1);
        System.out.println(b>>2);
    }
}
