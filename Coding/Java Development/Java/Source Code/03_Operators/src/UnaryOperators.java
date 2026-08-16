public class UnaryOperators {
    public static void main(String[] args) {
        System.out.println("Unary Operator: ");
        int a = 15;
        int b = -a; //Unary Minus
        int c = -b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int num = 5;
        num = num + 1;
        System.out.println(num);
        num += 1;
        System.out.println(num);
        num++; // Post Increment - Use the value in statement and then increase by 1
        System.out.println(num);
        ++num; //Pre Increment - Increase the value by one and then use in the statement
        System.out.println(num);

        int p = 5;
        System.out.println(p++); //This is the statement, use inside statement meaning....
        System.out.println(p); //Used in the statement and increased
        System.out.println(++p);// Increased then used in statement
        System.out.println(p);

        //Actual meaning of the definition of these seen in these statements

        int d = 9;
        System.out.println(d--); // Post Decrement
        System.out.println(d);
        System.out.println(--d); // Pre Decrement
        System.out.println(d);

        //Suggested to be used post increment/decrement and not to be used in statement
    }
}
