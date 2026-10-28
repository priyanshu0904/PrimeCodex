public class Operations {
    public static void main(String[] args) {
        //assignment operator
        int x = 5;

        //arithmetic operator
        int num1 = 7;
        int num2 = 5;
        int rs1 = num1 + num2;
        int rs2 = num1 - num2;
        int rs3 = num1 * num2;
        int rs4 = num1 / num2;
        int rs5 = num1 % num2;
        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
        System.out.println(rs4);
        System.out.println(rs5);

        //shorthand operator
        num1 += 2;
        num1 -= 2;
        num1 *= 2;
        num1 /= 2;
        num1 %= 2;
        System.out.println(num1);

        //increment or decrement operator (post or pre)
        num1++; //++num1;
        System.out.println(num1);
        num1--; //--num1;
        System.out.println(num1);

        //relational operator
        int x1 = 9;
        int x2 = 7;
        System.out.println(x1 > x2);
        System.out.println(x1 >= x2);
        System.out.println(x1 < x2);
        System.out.println(x1 <= x2);
        System.out.println(x1 == x2);
        System.out.println(x1 != x2);

    }
}
