package Problem6;

public class TypeConversion {
    public static void main(String[] args) {
        byte b = 125;
        short s = 12500;
        int i = 128964;
        long l = 1200000L;
        float f = 120.598f;
        double d = 120.56897889988;
        char c = 'c';
        System.out.println("b: " + b);
        System.out.println("s: " + s);
        System.out.println("i: " + i);
        System.out.println("l: " + l);
        System.out.println("f: " + f);
        System.out.println("d: " + d);
        System.out.println("c: " + c);
        System.out.println();

        //Widening
        double d1 = f;
        float f1 = l;
        long l1 = i;
        int i1 = s;
        short s1 = b;
        int ix = c;
        System.out.println("s1: " + s1);
        System.out.println("i1: " + i1);
        System.out.println("l1: " + l1);
        System.out.println("f1: " + f1);
        System.out.println("d1: " + d1);
        System.out.println("ix: " + ix);
        System.out.println();

        //Narrowing
        byte b2 = (byte) s;
        short s2 = (short) i;
        int i2 = (int) l;
        long l2 = (long) f;
        float f2 = (float) d;
        char c2 = (char) b;
        System.out.println("b2: " + b2);
        System.out.println("s2: " + s2);
        System.out.println("i2: " + i2);
        System.out.println("l2: " + l2);
        System.out.println("f2: " + f2);
        System.out.println("c2: " + c2);
    }
}
