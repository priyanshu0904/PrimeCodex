public class Parameter {
    public static void main(String[] args) {
        int num = addition(55, 88); //Arguments
        System.out.println(num);
        System.out.println(addition(47, 78));
    }

    public static int addition(int num1, int num2){ //Parameters
        System.out.println("First number received: " + num1);
        System.out.println("Second number received: " + num2);
        int sum = num1 + num2;
        return sum;
    }
}
