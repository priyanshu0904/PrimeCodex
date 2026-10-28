public class Literals {
    public static void main(String[] args) {
        //literals
        int num1 = 0b101; //binary
        System.out.println(num1);
        int num2 = 0x7C; //hexadecimal
        System.out.println(num2);
        int num3 = 012; //octal
        System.out.println(num3);
        int num4 = 88; //decimal
        System.out.println(num4);

        int num5 = 1_00_00_000;
        System.out.println(num5);

        double num = 56;
        System.out.println(num);

        double db = 12e10;
        System.out.println(db);

        char c = 'a';
        System.out.println(c);
        c++;
        System.out.println(c);

    }
}
