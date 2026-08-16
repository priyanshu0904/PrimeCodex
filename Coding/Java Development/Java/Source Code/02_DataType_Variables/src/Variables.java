public class Variables {
    public static void main(String[] args) {
        //data_type variable_name = value;
        //stored in memory cells (RAM) - memory address and a name mapped to that address - in the format of 0 and 1

        int a; // declaration
        a = 20; //  initialization or assignment
        int b = 10; // declaration and initialization

        System.out.println(a);
        System.out.println(b);
        b = 55;
        System.out.println(b);
        //value overlapped or replaced

        int sum = a + b;
        System.out.println(sum);

        boolean isLazy = true;
        System.out.println(isLazy);
    }
}
