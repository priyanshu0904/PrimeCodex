public class TypeCasting {
    public static void main(String[] args) {
        //Casting or explicit conversion
        byte b = (byte) 257; //Doing modulus -> 257 % 256
        System.out.println(b);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);

        //conversion or implicit conversion
        double d = 15;
        System.out.println(d);

        //type promotion
        byte a1 = 10;
        byte a2 = 30;
        int result = a1 * a2; //byte * byte = int
        System.out.println(result);
    }
}
