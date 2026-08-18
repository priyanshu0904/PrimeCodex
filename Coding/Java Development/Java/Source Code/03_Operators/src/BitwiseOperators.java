public class BitwiseOperators {
    public static void main(String[] args) {
        //Integer values converted to binary and bit by bit performing task
        int a = 12;
        int b = 13;
        //Bitwise AND &
        System.out.println(a & b); //both bits 1 then 1 otherwise 0

        //Bitwise OR |
        System.out.println(a | b); //both bits 0 then 0 otherwise 1

        //Bitwise XOR ^(cap sign)
        System.out.println(a ^ b); //both bits same then 0, different then 1

        //Bitwise NOT ~(tilled sign)
        System.out.println(~a); //Invert bits of operand, 2's complement, result ~x = -(x + 1)
        System.out.println(~b);

        //Left shift operator <<
        //a<<b -> a * 2^b
        System.out.println(a<<1); //Shift the bit to the left 1 time and created space fill 0.
        System.out.println(b<<2);

        //Right shift operator >>
        //a>>b -> a / 2^b
        System.out.println(a>>1);
        System.out.println(b>>2); //Shift the bit to the right 2 times and the bits get discarded.
    }
}
