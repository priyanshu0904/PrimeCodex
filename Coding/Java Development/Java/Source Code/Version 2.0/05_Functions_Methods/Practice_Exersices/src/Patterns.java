public class Patterns {
    public static void main(String[] args) {
        pattern1();
        System.out.println(); //To add the blank line
        pattern2();
        System.out.println();
        pattern3();
    }

    public static void pattern1() {
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *");

        int i = 0;
        while(i < 5){
            System.out.print("*");
            int j = 0;
            while(j < i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern2() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }

    public static void pattern3() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}
